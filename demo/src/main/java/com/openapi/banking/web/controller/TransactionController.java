package com.openapi.banking.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openapi.banking.domain.Transaction;
import com.openapi.banking.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired private TransactionService transactionService;
	
	
	@GetMapping("/transactions")
	public List<Transaction> getAllTransactions() {
		
		return transactionService.findAllByAccountNumber();
		
	}

}
