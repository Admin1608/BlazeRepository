package test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class CreditCardScore extends BaseClass{
		
	
	public void ValidContactNumber1() throws Exception
	{
					      
	   driver.findElement(By.xpath(properties.getProperty("Continue"))).click();
	   
	  /*WebElement dateBox = driver.findElement(By.xpath(properties.getProperty("ID1ExpiryDate")));

	      dateBox.sendKeys(properties.getProperty("ID1Value"));
	      
	   WebElement dateBox1 = driver.findElement(By.xpath(properties.getProperty("ID2ExpiryDate")));

	      dateBox1.sendKeys(properties.getProperty("ID2Value")); */
	 
	}
	}


