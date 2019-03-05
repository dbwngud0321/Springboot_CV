package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AccountDao;
import com.example.demo.model.Account;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
@Transactional
public class AccountService {
	@Autowired
	private AccountDao accountDao;

	public List<Account> getAccountList() throws Exception {
		return accountDao.getAccountList();
	}
}
