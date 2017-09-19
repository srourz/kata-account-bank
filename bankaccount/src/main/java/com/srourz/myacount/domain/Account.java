package com.srourz.myacount.domain;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String name;
	private Double balance;
	private List<Transaction> statement;
	
	public Account(){
		
	}
	
	public Account(String name, Double balance){
		this.name = name;
		this.balance = balance;
		statement = new ArrayList<Transaction>();
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public List<Transaction> getStatement() {
		return statement;
	}

	public void setStatement(List<Transaction> statement) {
		this.statement = statement;
	}

}
