package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.contactservice.ContactService;
import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.service.LeadService;

@Controller
public class LeadController {
	//http://localhost:8080/newLead
	@RequestMapping("/newLead")
	public String loadLeadForm() {
		return "load_lead";
	}
	
	@Autowired
	private LeadService leadSer;
	
	//http://localhost:8080/createLead
	@RequestMapping("/createLead")
	public String createALead(Lead lead,ModelMap model,@RequestParam("email") String email) {
		leadSer.create(lead);
		model.addAttribute("createLead",lead);
		return "save_lead_page";
	}
	
	@Autowired
	private ContactService contactSer;
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") Long id,Model model) {
		Lead byId = leadSer.getById(id);
		
		Contact contact=new Contact();
		contact.setAadhaarId(byId.getAadhaarId());
		contact.setName(byId.getName());
		contact.setAddress(byId.getAddress());
		contact.setEmail(byId.getEmail());
		contact.setMobile(byId.getMobile());
		
		contactSer.saveContact(contact);
		
		leadSer.deleteById(id);
		
		List<Contact> list = contactSer.getAllLeads();
		model.addAttribute("list", list);
		
		return "list_contact";
	}
	
	//http://localhost:8080/listLeads
	@RequestMapping("/listLeads")
	public String listLeads(Model model) {
		List<Lead> list = leadSer.getAllLeads();
		model.addAttribute("list", list);
		return "list_lead";
	}
	
	@RequestMapping("/contactLeads")
	public String contactLeads(Model model) {
		List<Contact> list = contactSer.getAllLeads();
		model.addAttribute("list", list);
		
		return "list_contact";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") Long id,Model model) {
		Lead byId = leadSer.getById(id);
		model.addAttribute("createLead", byId);
		return "save_lead_page";
	}
}
