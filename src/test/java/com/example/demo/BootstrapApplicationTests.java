package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dto.Account;
import com.example.demo.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootstrapApplicationTests {

	@Autowired
	private AccountService accountService;
	
	@Test
	public void test() throws Exception {
		List<Account> list = accountService.getAccountList(); 
		assertThat(list).isNotEmpty();
	}

}
