package com.openapi.banking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import com.openapi.banking.DemoApplication;
import com.openapi.banking.service.TransactionService;

@SpringBootTest
@AutoConfigureMockMvc
@Import (DemoApplication.class)
public class TransactionServiceImplTest {
	
	@Autowired TransactionService transactionService;
	
	@Test
	void testFindAllByAccountNumber() {
		assertEquals(0,transactionService.findAllByAccountNumber().size());
	}

}
