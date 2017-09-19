package com.srourz.myacount.exception;

public class BusinessException extends Exception{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessException(String message) {    	
        super(message);        
    }

    public BusinessException(Exception exception) {
        super(exception);
    } 

}
