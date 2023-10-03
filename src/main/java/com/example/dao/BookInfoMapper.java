package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.BookAddForm;
import com.example.entity.BookInfo;

@Mapper
public interface BookInfoMapper {
	
	void bookAdd(BookAddForm bookAddForm);
	
	List<BookInfo> bookFindAll();

}
