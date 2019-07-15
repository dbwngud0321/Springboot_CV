package com.example.demo.dto;

import lombok.Data;

@Data
public class Account {
	private int idx; // idx of account
	
	private String id; // id
	
	private String pw;
	
	private String description;
	
	private String registtime;

}
