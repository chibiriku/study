package com.example.entity;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class UserInfo implements Serializable {
    
    private Long id;
    
    private String name;
    
    private String mail;
   
    private String password;
    
    private Date updateDate;
   
    private Date createDate;
   
    private Date deleteDate;
}