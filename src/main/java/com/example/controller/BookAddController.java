package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.BookAddForm;
import com.example.service.BookService;

@Controller
@RequestMapping("book")
public class BookAddController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/add")
	public String getBookAdd(Model model) {
		model.addAttribute("BookAddForm" , new BookAddForm());
		return "book/add";
	}
	
	@PostMapping("/add")
	public String postBookAdd(@ModelAttribute BookAddForm form, Model model) {
		bookService.bookAdd(form);
		return "redirect:/book/list";
	}

}
