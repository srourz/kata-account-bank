package com.srourz.myacount.service;

import java.util.Date;

import com.srourz.myacount.domain.Account;
import com.srourz.myacount.domain.Transaction;
import com.srourz.myacount.domain.TransactionType;
import com.srourz.myacount.exception.BusinessException;
import com.srourz.myacount.util.FormattingUtil;

public class AccountServiceImpl implements AccountService{
	
	public void deposit(Account account, Double amount){
		account.setBalance(account.getBalance() + amount);
		addTransaction(account, TransactionType.DEPOSIT); 		
	}
	
	public void withdrawal(Account account, Double amount) throws BusinessException{
		if(amount>account.getBalance())
			throw new BusinessException("you don't have sufficient credit");
		
		account.setBalance(account.getBalance() - amount);
		addTransaction(account, TransactionType.WITHDRAWAL);
			
	}
	
	public String displayStatement(Account account){
		StringBuffer statement = new StringBuffer("The statement of the account\n");
		for (Transaction transaction:account.getStatement()){
			statement.append(transaction.toString() + "\n");			
		}
		statement.append("Balance : ").append(FormattingUtil.formatDouble(account.getBalance())).append("\n");
		return statement.toString();
	}
	
	private void addTransaction(Account account, TransactionType transactionType){
		account.getStatement().add(new Transaction(new Date(), account.getBalance(), transactionType));
	}

}
