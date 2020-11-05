package com.blazefet.securitydetails;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FloorAreaSizeValid {
	

	@Test
	public void ValidFoorAreaSize() throws Exception
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
		driver.findElement(By.xpath(properties.getProperty("Continue"))).click();
		WebElement Product=driver.findElement(By.xpath(properties.getProperty("ProductType")));
		Select select=new Select(Product);
		select.selectByIndex(1);
		WebElement Facility=driver.findElement(By.xpath(properties.getProperty("FacilityType")));
		Select select1=new Select(Facility);
		select1.selectByIndex(2);
		WebElement LoanPurpose=driver.findElement(By.xpath(properties.getProperty("LoanPurpose")));
		Select select2=new Select(LoanPurpose);
		select2.selectByIndex(5);
		WebElement Purposemoreinformation=driver.findElement(By.xpath(properties.getProperty("Purposemoreinformation")));
		Select select3=new Select(Purposemoreinformation);
		select3.selectByIndex(8);
		driver.findElement(By.xpath(properties.getProperty("LoanTerm(Months)"))).sendKeys(properties.getProperty("LoanTerm(Months)Value"));
		driver.findElement(By.xpath(properties.getProperty("AmountRequested(NewMoney)"))).sendKeys(properties.getProperty("AmountRequested(NewMoney)Value"));
		driver.findElement(By.xpath(properties.getProperty("InterestRate%"))).sendKeys(properties.getProperty("InterestRate%Value"));
		driver.findElement(By.xpath(properties.getProperty("Continue1"))).click();
		WebElement SecurityType=driver.findElement(By.xpath(properties.getProperty("SecurityType")));
		Select select4=new Select(SecurityType);
		select4.selectByIndex(1);
		driver.findElement(By.xpath(properties.getProperty("FloorAreaSize"))).sendKeys(properties.getProperty("FloorAreaSizeValue"));


}

}
