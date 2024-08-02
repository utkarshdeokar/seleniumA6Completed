package com.crm.tiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.crm.BaseClass.VtigerBase;
import com.crm.FileUtility.ExcelDataOrganization;
import com.crm.POM.POMOraganization2;


public class CreateOrganiationWithIndustries extends VtigerBase  {

	@Test
	public void industry() throws EncryptedDocumentException, IOException {
		
		ArrayList<String> data= ExcelDataOrganization.excelData();
		
		POMOraganization2 ref = new POMOraganization2(driver);

		
		
		ref.organization();
		ref.add();
		ref.orgaName(data.get(0));
		

		ref.industry(data.get(1));
		ref.save();
		
	}
}
