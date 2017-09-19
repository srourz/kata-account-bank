package com.srourz.myacount.service;

public class ServiceFactory {

	private static AccountService accountService = new AccountServiceImpl();
	
	public static AccountService getAccountServiceInstance(){
		return accountService;
	}
}
