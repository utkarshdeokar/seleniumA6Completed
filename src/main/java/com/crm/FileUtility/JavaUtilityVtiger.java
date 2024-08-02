package com.crm.FileUtility;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtilityVtiger {

	
	
	public static String loginData(String key) throws IOException {
	
    Properties prop = new Properties();
	FileInputStream fis= new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\QspiderDeccan\\src\\test\\resources\\loginFunction.properties");
	
	prop.load(fis);
	
	String data= prop.getProperty(key);
	return data;
	
}
	
	
	
	
}
