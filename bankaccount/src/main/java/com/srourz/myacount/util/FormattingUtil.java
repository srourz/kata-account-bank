package com.srourz.myacount.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattingUtil {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	public static String formatDate(Date date){
		return sdf.format(date);
	}

	public static String formatDouble(Double amount){
		return df2.format(amount);
	}
	
}
