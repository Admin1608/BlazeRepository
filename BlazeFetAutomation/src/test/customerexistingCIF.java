
package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class customerexistingCIF extends CommFunc {

	CommFunc cf = new CommFunc();
	
	public void START() throws Exception
 {
		cf.CLICK("Login", driver, properties);
		cf.WAIT(2000, driver, properties);
		
		cf.CLICK("NewApplication", driver, properties);
		cf.WAIT(2000, driver, properties);
        
        	
		//APPLICANT_1		
		cf.CLICK("Applicant1Expand",driver,properties);	 		 	
	 		
		cf.CLICK("Existing",driver,properties);
        cf.CLICK("Existing",driver,properties);
        
        cf.INPUT("CIFNumber", "CIFNumberValue", driver, properties);
        cf.CLICK("CIFNumberLabel", driver, properties);		
		
        cf.WAIT(2000, driver, properties);
        
		String FN = cf.GETATTRIBUTE("FirstName", "value", driver, properties);
		cf.PrintString(FN);		
		String LN = cf.GETATTRIBUTE("lastname", "value", driver, properties);
		cf.PrintString(LN);
		String CN1 = cf.GETATTRIBUTE("ContactNumber1", "value", driver, properties);
		cf.PrintString(CN1);
		String CN2 = cf.GETATTRIBUTE("ContactNumber2", "value", driver, properties);
		cf.PrintString(CN2); 
		String CA1 = cf.GETATTRIBUTE("currentaddressline1", "value", driver, properties);
		cf.PrintString(CA1);
		String CA2 = cf.GETATTRIBUTE("currentaddressline2", "value", driver, properties);
		cf.PrintString(CA2);
		String PA1 = cf.GETATTRIBUTE("PostalAddressLine1", "value", driver, properties);
		cf.PrintString(PA1);
		String PA2 = cf.GETATTRIBUTE("PostalAddressLine2", "value", driver, properties);
		cf.PrintString(PA2);
		
		String COB = cf.GETFIRSTSELECTEDOPTION("Countryofbirth", driver, properties);
		cf.PrintString(COB);		
		
		
		
		
       
            
}
}


