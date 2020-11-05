package com.blazefet.customerdetails;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactNumber2Valid {
	
	@Test
	public void ValidContactNumber2() throws Exception
	{
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\galidevt\\eclipse-workspace\\BlazeFetAutomation\\Config.properties");
		Properties properties = new Properties();
		properties.load(fis);
		System.setProperty("webdriver.chrome.driver", properties.getProperty("chromedriverpath"));
		WebDriver driver = new ChromeDriver();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("scrollclick"))).click();
		driver.findElement(By.xpath(properties.getProperty("ContactNumber2"))).sendKeys(properties.getProperty("ContactNumber2Value"));
		
	}

}
