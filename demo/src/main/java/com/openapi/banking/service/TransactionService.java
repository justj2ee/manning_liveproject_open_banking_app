package com.openapi.banking.service;

import java.util.List;


import com.openapi.banking.domain.Transaction;


public interface TransactionService {
	List<Transaction> findAllByAccountNumber();
}
