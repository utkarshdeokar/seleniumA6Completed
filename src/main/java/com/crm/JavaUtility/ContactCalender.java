package com.crm.JavaUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactCalender {

	
	
	
	public static String startDate() {

		Date date = new Date();
	
	SimpleDateFormat sim= new SimpleDateFormat("yyyy-MM-dd");
	
	String currentDate= sim.format(date);
	return currentDate;
			
		}
	
	public static String afterDate() {

		
SimpleDateFormat sim= new SimpleDateFormat("yyyy-MM-dd");
	
	Calendar cal= sim.getCalendar();
	cal.add(Calendar.DAY_OF_MONTH, 80);
	
	String afterDate= sim.format(cal.getTime());
	return afterDate;
			
		}
	
	
	
}
