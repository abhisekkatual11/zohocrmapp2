package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.billingservice.BillingService;
import com.zohocrm.contactservice.ContactService;
import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;

@Controller
public class BillingController {
	@Autowired
	private BillingService billSer;
	
	@Autowired
	private ContactService contactSer;
	
	@RequestMapping("/billing")
	public String billing(@RequestParam("id")Long id,Model model) {
		Contact byId = contactSer.getById(id);
		model.addAttribute("byId", byId);
		return "generate_bill";
	}
	
	@RequestMapping("/save")
	public String saveAllBill(Billing bill,Model model) {
		model.addAttribute("bill", bill);
		billSer.saveBill(bill);
		return "billing";
	}
	
	@RequestMapping("/allBills")
	public String getAll(ModelMap model) {
		List<Billing> allBills = billSer.getAllBills();
		model.addAttribute("bill", allBills);
		return "list_bill";
	}
}
