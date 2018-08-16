package com.capgemini.merchantstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.merchantstore.beans.Merchant;
import com.capgemini.merchantstore.services.IMerchantService;

@Controller
public class MerchantController {
	
	@Autowired
	IMerchantService MerchantServices;
	
	@RequestMapping(value = "merchantSignIn")
	public ModelAndView addMerchant(@ModelAttribute("merchant") Merchant merchant, @RequestParam("securityQuestion") String question, @RequestParam("type") String type) {
		System.out.println(type);
		merchant.setSecurityQuestion(question);
		merchant = MerchantServices.addMerchant(merchant);
		return new ModelAndView("homePage");
	}
	
}
