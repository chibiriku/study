package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.BookInfo;
import com.example.service.BookService;

@Controller
@RequestMapping("/book")
public class BookListController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/list")
	public String bookList(Model model) {
		List<BookInfo> bookList = bookService.bookFindAll();
		model.addAttribute("bookList" , bookList);
		return "book/list";
	}

}
