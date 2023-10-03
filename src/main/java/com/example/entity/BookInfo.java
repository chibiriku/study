package com.example.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class BookInfo {
	
	private Long id;
	
	private String name;
	
	private String author;
	
	private String synopsis;
	
	private Date updateDate;
	   
    private Date createDate;
   
    private Date deleteDate;

}
