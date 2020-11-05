package com.blazefet.customerdetails;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;


public class CreditCardScore {
			
	@Test
	public void ValidContactNumber1() throws Exception
	{
			
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\chauhaa4\\EC_workspace\\BlazeFetAutomation\\Config.properties");
		Properties properties = new Properties();
		properties.load(fis);
	    System.setProperty("webdriver.chrome.driver",properties.getProperty("chromedriverpath"));
	    WebDriver driver = new ChromeDriver();
		
		//String Url = "http://iisau301mel0623.globaltest.anz.com:8088/new-consumer-loan#";
		driver.get(properties.getProperty("url"));
		
	   Thread.sleep(2000);	
	   
	   driver.findElement(By.xpath(properties.getProperty("Applicant_1"))).click();
	   
	   WebElement dateBox = driver.findElement(By.xpath(properties.getProperty("ID1ExpiryDate")));

	      dateBox.sendKeys(properties.getProperty("ID1Value"));
	      
	   WebElement dateBox1 = driver.findElement(By.xpath(properties.getProperty("ID2ExpiryDate")));

	      dateBox1.sendKeys(properties.getProperty("ID2Value")); 
	 
	}
	}


