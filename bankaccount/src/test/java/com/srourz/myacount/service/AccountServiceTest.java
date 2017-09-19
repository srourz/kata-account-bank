package com.srourz.myacount.service;

import junit.framework.TestCase;

import org.junit.Test;

import com.srourz.myacount.domain.Account;
import com.srourz.myacount.exception.BusinessException;

public class AccountServiceTest  extends TestCase{
	AccountService accountService = ServiceFactory.getAccountServiceInstance();

	@Test
	public void testDeposit(){
		Account account = new Account("Zaher SROUR", 2000d);
		accountService.deposit(account, 500d);		
		assertEquals(2500d, account.getBalance());
		assertEquals(1, account.getStatement().size());
		accountService.deposit(account, 353d);
		assertEquals(2853d, account.getBalance());
		assertEquals(2, account.getStatement().size());		
	}
	
	@Test
	public void testSucessfullWithdrawal() throws BusinessException{
		Account account = new Account("Zaher SROUR", 2000d);
		accountService.withdrawal(account, 550d);
		assertEquals(1450d, account.getBalance());
		assertTrue("the withdrawal transaction is token in charge", account.getStatement().size()==1);
	}

	@Test
	public void testFaildWithdrawal() {
		Account account = new Account("Zaher SROUR", 2000d);
		try {
			accountService.withdrawal(account, 550d);
		} catch (BusinessException e) {
			 assert(e.getMessage().contains("you don't have sufficient credit"));
			e.printStackTrace();
		}		
	}
	
	@Test
	public void testDisplayStatement() throws BusinessException{
		Account account = new Account("Zaher SROUR", 2000d);
		accountService.withdrawal(account, 550d);
		accountService.deposit(account, 400d);
		
		assert(accountService.displayStatement(account).contains("withdrawal"));
		assert(accountService.displayStatement(account).contains("1450"));
		assert(accountService.displayStatement(account).contains("deposit"));
		assert(accountService.displayStatement(account).contains("400"));
	}
}
