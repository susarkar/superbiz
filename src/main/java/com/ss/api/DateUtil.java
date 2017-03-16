package com.ss.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static String simpleFormat = "dd.MM.yyyy";
	
	public static String toSimpleFormat(Date date){
		DateFormat format = new SimpleDateFormat(simpleFormat);
		return format.format(date);
        
	}
	
	public static Date toDate(String s){
		DateFormat format = new SimpleDateFormat(simpleFormat);
		Date d=null;
		try {
			d = format.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
}
