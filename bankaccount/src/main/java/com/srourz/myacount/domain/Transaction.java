package com.srourz.myacount.domain;

import java.util.Date;

import com.srourz.myacount.util.FormattingUtil;

public class Transaction {
	private Date transactionDate;
	private Double amount;
	private TransactionType transactionType;
	
	public Transaction(){
		
	}
	
	public Transaction(Date transactionDate, Double amount, TransactionType transactionType){
		this.transactionDate = transactionDate;
		this.amount = amount;
		this.transactionType = transactionType;		
	}	
	
	public String toString(){
		return FormattingUtil.formatDate(this.transactionDate) + " | " + this.transactionType.getLabel() 
				+ " | " + FormattingUtil.formatDouble(this.amount);
	}

}
