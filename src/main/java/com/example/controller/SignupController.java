package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.SignupForm;
import com.example.service.UserService;

@Controller
@RequestMapping("/user")
public class SignupController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/signup")
	public String getSignup(Model model) {
		model.addAttribute("SignupForm" , new SignupForm());
		return "user/signup";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute SignupForm form, Model model) {
		userService.userAdd(form);
		return "redirect:/login";
	}

}
