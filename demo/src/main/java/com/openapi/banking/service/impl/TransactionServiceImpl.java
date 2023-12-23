package com.openapi.banking.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.openapi.banking.domain.Transaction;
import com.openapi.banking.service.TransactionService;
@Service("transactionService")
public class TransactionServiceImpl implements TransactionService {
	
	
		
	

	@Override
	public List<Transaction> findAllByAccountNumber() {
		List<Transaction> transactionList = new ArrayList<Transaction>();
		return  transactionList;
	}

}
