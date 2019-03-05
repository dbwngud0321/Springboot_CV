package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;

@Controller
public class SimpleController {
	@Value("${spring.application.name}")
	String appName;
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
	
	@GetMapping("/account")
	public String account(Model model) throws Exception {
		List<Account> account = accountService.getAccountList();
		model.addAttribute("account", account);
		return "home";
	}

}
