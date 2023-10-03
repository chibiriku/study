package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BookInfoMapper;
import com.example.dto.BookAddForm;
import com.example.entity.BookInfo;

@Service
public class BookService {
	
	@Autowired
	private BookInfoMapper bookInfoMapper;
	
	public void bookAdd(BookAddForm bookAddForm) {
		bookInfoMapper.bookAdd(bookAddForm);
	}
	
	public List<BookInfo> bookFindAll() {
		return bookInfoMapper.bookFindAll();
	}

}
