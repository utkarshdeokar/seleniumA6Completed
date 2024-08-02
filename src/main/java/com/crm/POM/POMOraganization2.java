package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMOraganization2 {

	
	public POMOraganization2(WebDriver driver) {
		
		
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
	
	
	private @FindBy(xpath = "//select[@name='industry']")
	
	WebElement industry;
	
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
	
	public void industry(String ind) {
		industry.click();
		
		Select sel= new Select(industry);
		
		
		sel.selectByVisibleText(ind);
		
			
		}
	
}


