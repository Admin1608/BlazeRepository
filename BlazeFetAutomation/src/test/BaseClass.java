package test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	
	WebDriver driver;
	Properties properties;
	Actions action;
	int value;
	
		
	@BeforeMethod
	public void Base() throws Exception
	{
		File ConfigFile = new File(System.getProperty("user.dir") + "\\Config.properties");
		FileInputStream fis = new FileInputStream((ConfigFile)); 
		properties = new Properties();
		File DataFile = new File(System.getProperty("user.dir") + "\\Data.properties");
		FileInputStream fis1 = new FileInputStream((DataFile));
		properties.load(fis);
		properties.load(fis1);
		System.setProperty("webdriver.chrome.driver",properties.getProperty("chromedriverpath"));
	    driver = new ChromeDriver();
	    driver.get(properties.getProperty("url"));
	    
		driver.manage().window().maximize();
		action=new Actions(driver);
		Thread.sleep(2000);
				
	}
	
	@AfterMethod(enabled=false)
	public void Close()
	{
		driver.close();
	}
	
	
	
}
