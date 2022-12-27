package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.emailservice.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailSer;
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("email") String email,Model model) {
		model.addAttribute("email", email);
		return "compose_mail";
	}
	
	@RequestMapping("/send")
	public String send(@RequestParam("to") String to,@RequestParam("sub") String sub,@RequestParam("msg") String msg,Model model) {
		emailSer.sendEmail(to, sub, msg);
		model.addAttribute("sent","Successfully sent Email");
		return "compose_mail";
	}
}
