package com.openapi.banking.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Transaction {
	
	private String type;
	private Date transactionDate;
	private String accountNumber;
	private String transCurrency;
	private BigDecimal amount;
	private String merchantName;
	private String merchantLogo;

}
