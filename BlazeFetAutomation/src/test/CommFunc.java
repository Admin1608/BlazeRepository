package test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class CommFunc extends BaseClass{
	
	
	
	
    public void SELECTBYVALUE (String name , String value , WebDriver driver , Properties properties) throws Exception
	{
    	
        Select SV = new Select(driver.findElement(By.xpath("//select[@id=\"select__ApplicationType\"]")));
	    SV.selectByValue(properties.getProperty(value));
	
    }
    
    public void SELECTBYINDEX (String name , int value , WebDriver driver , Properties properties) throws Exception
	{
    	
        Select SI = new Select(driver.findElement(By.xpath(properties.getProperty(name))));
        SI.selectByIndex(value);
	    //SI.selectByIndex(properties.getProperty(value));
	
    }
	
	public void CLICK (String name , WebDriver driver , Properties properties) throws Exception
	{
		
		//driver.findElement(By.xpath(properties.getProperty("Joint"))).click();
		driver.findElement(By.xpath(properties.getProperty(name))).click();
        
    }
	
	public void INPUT (String name , String value , WebDriver driver, Properties properties) throws Exception
	{
	       
       driver.findElement(By.xpath(properties.getProperty(name))).sendKeys(properties.getProperty(value));
	}
	
	public String GETTEXT (String name , WebDriver driver , Properties properties) throws Exception
	{
	       
		String value= driver.findElement(By.xpath(properties.getProperty(name))).getText();
		return (value);
		
	}
	
	public void VERIFYTEXT (String value1, String value2 ,WebDriver driver , Properties properties ) throws Exception
	{
		if (value1.equals(value2))
			
			System.out.println("EQUAL");
			
		else 
			
			System.out.println("NOT EQUAL");	
	}
	
	public void WAIT (long value ) throws Exception
	{
	   
		Thread.sleep(value);
       
	}
	
	public void DOUBLECLICK (Actions action , String value , WebDriver driver, Properties properties) throws Exception
	{
	       
		WebElement DC=driver.findElement(By.xpath(properties.getProperty(value)));
		action.doubleClick(DC).build().perform();
	}	

}	