package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMOrganization {

	
public POMOrganization(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
 	}
	
	
	
	
	private @FindBy(xpath = "(//a[text()='Organizations'])[1]")
	
	WebElement organization;
	
	private @FindBy(xpath = "//img[@alt='Create Organization...']")
	WebElement add;
	
	private @FindBy(xpath = "//input[@name='accountname']")
	
	WebElement orgaName;
	
	private @FindBy(xpath = "(//input[@value='  Save  '])[1]")
	
	WebElement save;
	
	
	public void organization() {
		organization.click();
		
	}
	
	public void add() {
	add.click();
		
	}
	
	public void orgaName(String name) {
		
		orgaName.sendKeys(name);
			
		}
	
	public void save() {
		save.click();
			
		}
	
}
