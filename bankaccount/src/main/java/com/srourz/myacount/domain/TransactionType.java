package com.srourz.myacount.domain;

public enum TransactionType {
	WITHDRAWAL("withdrawal"), DEPOSIT("deposit");
	
	private TransactionType(String label){
		this.label = label;
	}
	
	private String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
