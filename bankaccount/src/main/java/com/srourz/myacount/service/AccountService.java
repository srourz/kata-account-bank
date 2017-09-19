package com.srourz.myacount.service;

import com.srourz.myacount.domain.Account;
import com.srourz.myacount.exception.BusinessException;

public interface AccountService {

	/**
	 * Deposit an amount in the account
	 * @param account
	 * @param amount
	 */
	public void deposit(Account account, Double amount);
	
	/**
	 * withdrawal an amount from the account
	 * @param account
	 * @param amount
	 * @throws BusinessException
	 */
	public void withdrawal(Account account, Double amount) throws BusinessException;
	
	/**
	 * return the statement details
	 * @param account
	 * @return
	 */
	public String displayStatement(Account account);
}
