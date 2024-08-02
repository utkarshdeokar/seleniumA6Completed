package com.crm.tiger;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.BaseClass.VtigerBase;
import com.crm.FileUtility.ExcelDataOrganization;
import com.crm.POM.POMContactDate;

public class CreateContactWithSupportStartDateAndTime extends VtigerBase {

	
	@Test
	public void date() throws EncryptedDocumentException, IOException {
		
	ArrayList<String>data= ExcelDataOrganization.excelData();
		
		POMContactDate ref= new POMContactDate(driver);
		
		ref.contacts();
		ref.add();
		ref.lastName(data.get(2));
		
		Actions act= new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		ref.startDate();
		ref.endDate();  
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
