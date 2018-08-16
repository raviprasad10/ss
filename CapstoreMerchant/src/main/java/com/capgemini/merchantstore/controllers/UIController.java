package com.capgemini.merchantstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.merchantstore.beans.Merchant;

@Controller
public class UIController {
	
	@RequestMapping(value="/")
	public String getIndexPage() {
		return "indexPage";	
	}
	
	@RequestMapping(value="SignIn")
	public String getSignInPage() {
		return "SignIn";	
	}
	
	@ModelAttribute
	public Merchant getNewMerchant() { 
		return new Merchant();
	}
	
	@RequestMapping(value="/login")
	public String getLogInPage() {
		return "login";	
	}
	
	@RequestMapping(value="/homePage")
	public String getHomePage() {
		return "homePage";	
	}
}
