package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;

@Mapper
@Repository
public interface AccountDao {
	
	public List<Account> getAccountList() throws Exception;
}
