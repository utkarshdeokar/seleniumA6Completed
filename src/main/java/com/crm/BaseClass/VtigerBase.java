package com.crm.BaseClass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import com.crm.FileUtility.JavaUtilityVtiger;

public class VtigerBase {

	public static WebDriver driver;

	@BeforeClass
	public void preCondition() throws IOException {

	String 	browser=JavaUtilityVtiger.loginData("browser");
	String	url=JavaUtilityVtiger.loginData("url");
		
		
		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}


		else if (browser.equalsIgnoreCase("firefox")) {

				driver = new FirefoxDriver();

			}

			else if (browser.equalsIgnoreCase("edge")) {

				driver = new EdgeDriver();

			}

			else if (browser.equalsIgnoreCase("safari")) {

				driver = new SafariDriver();

			}

			else {
				driver = new ChromeDriver();
			}

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			driver.get(url);

		}

	

	@BeforeMethod

	public void login() throws IOException {

		
		String expected_result="http://localhost:8888/index.php";
		
		String actual_result=driver.getCurrentUrl();
		
		//assertEquals(expected_result, actual_result);
		
	//	Reporter.log("Login Success",true);
		
		String username= JavaUtilityVtiger.loginData("username");
		
		String pass=JavaUtilityVtiger.loginData("pass");
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pass);
		
		driver.findElement(By.xpath("(//input[@value='Login'])[2]")).click();
		
		
		
	}

	@AfterMethod
	public void logout() {

	}

	@AfterClass

	public void postCondition() {

	}

}
