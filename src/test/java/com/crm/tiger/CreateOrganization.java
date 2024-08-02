package com.crm.tiger;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.VtigerBase;
import com.crm.FileUtility.ExcelDataOrganization;
import com.crm.POM.POMOrganization;

public class CreateOrganization extends VtigerBase {

	@Test
	public void open() throws EncryptedDocumentException, IOException {
		
		ArrayList<String>data=ExcelDataOrganization.excelData();
		
		String expected_result="Utkarsh";
		POMOrganization ref = new POMOrganization(driver);

		ref.organization();
		ref.add();
		ref.orgaName(data.get(0));
		ref.save();

		String actual_result = driver.findElement(By.xpath("(//span[contains(text(),'Utkarsh')])[1]")).getText();
		
		Reporter.log(actual_result,false);
		assertEquals(expected_result, actual_result);
		
	}
}
