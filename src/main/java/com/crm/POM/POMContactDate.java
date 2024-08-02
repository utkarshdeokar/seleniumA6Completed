package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.JavaUtility.ContactCalender;

public class POMContactDate {

	public POMContactDate(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//a[text()='Contacts']")

	WebElement contact;

	private @FindBy(xpath = "//img[@alt='Create Contact...']")

	WebElement add;

	private @FindBy(xpath = "//input[@name='lastname']")

	WebElement lastName;
	
	
	
    private @FindBy(xpath = "//img[@id='jscal_trigger_support_start_date']")
	
   WebElement startDate;
   
  
   
    private @FindBy(xpath = "//img[@id='jscal_trigger_support_end_date']")

	
	WebElement endDate;
	
    
    
    public void contacts() {
    	
    	contact.click();
    	
    }
    
    
   public void add() {
    	
    	add.click();
    	
    }
    
   public void lastName(String lastNamee) {
   	
   	
	   lastName.sendKeys(lastNamee);
   	
   }
   
   
   
   
   public void startDate() {
	   	
	   String date=ContactCalender.startDate();
	   	startDate.click();
	   startDate.sendKeys(date);
   	
   }
   
   
   public void endDate() {
	   String date=ContactCalender.afterDate();
	   	endDate.click();
	   endDate.sendKeys(date);
   	
   }
   
   
   
   
   
   
   
   
   
   
   
    
    
	
}
