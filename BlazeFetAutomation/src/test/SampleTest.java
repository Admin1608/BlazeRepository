package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class SampleTest extends CommFunc {
	
	CommFunc cf = new CommFunc();
	
	
	public void Creditcardunsecuredmethod() throws Exception
	{
		cf.CLICK("Login", driver, properties);
		cf.WAIT(2000, driver, properties);
		
		cf.CLICK("NewApplication", driver, properties);
		cf.WAIT(2000, driver, properties);		
        
        cf.CLICK("Individual", driver, properties);
        cf.CLICK("Individual", driver, properties);
		
		cf.SELECTBYINDEX("ApplicationType",1, driver,properties);
		//cf.SELECTBYINDEX("NumberOfApplicants",1, driver,properties);
	
		cf.CLICK("Applicant1Expand",driver,properties);		
		 	
	 	cf.SELECTBYINDEX("CustomerType",1, driver,properties);
	 	
		cf.CLICK("New", driver, properties);
		cf.CLICK("New", driver, properties);
		
		cf.SELECTBYINDEX("title",1, driver,properties);
		
		Actions act = new Actions(driver);	
		act.clickAndHold();		
		//System.out.println("hi1");
	    act.sendKeys("someone");
	    act.build().perform();
	    System.out.println("hi2");
	    act.sendKeys(Keys.TAB);
	    System.out.println("hi3");
	    act.build().perform();
		
		/*cf.INPUT("FirstName","FirstNamevalue", driver, properties);
		cf.INPUT("MiddleName","MiddleNameValue", driver, properties);
		cf.INPUT("lastname","LastNameValue", driver, properties);		
		cf.INPUT("DOB","DOBValue1", driver, properties);
		cf.INPUT("ContactNumber1","ContactNumber1Value", driver, properties);
		cf.INPUT("ContactNumber2","ContactNumber2Value", driver, properties);
		cf.INPUT("Emailaddress","Emailaddressvalue", driver, properties);
		cf.INPUT("MotherMaidenName","MotherMaidenNameValue", driver, properties);
		
		cf.SELECTBYINDEX("ResidentialStatus",1, driver,properties);
		
        
        cf.CLICK("PEP", driver, properties);
        cf.CLICK("PEP", driver, properties);
        
        cf.SELECTBYINDEX("Years",3, driver,properties);
        cf.SELECTBYINDEX("Month",3, driver,properties);
        
        cf.INPUT("currentaddressline1","currentaddressline1Value", driver, properties);
        cf.INPUT("currentaddressline2","currentaddressline2Value", driver, properties);
        
        cf.SELECTBYINDEX("LivingSituation",3, driver,properties);
        
        cf.INPUT("PostalAddressLine1","PostalAddressLine1Value", driver, properties);
        cf.INPUT("PostalAddressLine2","PostalAddressLine2Value", driver, properties);
        
        cf.SELECTBYINDEX("MaritalStatus",2, driver,properties);
        
        cf.CLEAR("NumberofDependentsAdults", driver, properties);
        cf.INPUT("NumberofDependentsAdults","NumberofDependentsAdulltsValue", driver, properties);
        
        cf.CLEAR("NumberofDependentsChildrens", driver, properties);
        cf.INPUT("NumberofDependentsChildrens","NumberofDependentsChildrensValue", driver, properties);
        
        cf.CLEAR("NumberofMotorVehicles", driver, properties);
        cf.INPUT("NumberofMotorVehicles","NumberofMotorVehiclesValue", driver, properties);
        
        cf.SELECTBYINDEX("LivingWorking",2, driver,properties);
        cf.SELECTBYINDEX("Countryofbirth",13, driver,properties);
        cf.SELECTBYINDEX("CitizenshipNew",13, driver,properties);
        
        cf.INPUT("ID1Name","ID1NameNewValue", driver, properties);
        cf.INPUT("ID2Name","ID2NameNewValue", driver, properties);
        cf.INPUT("ID2Number","ID1NumberNewValue", driver, properties);
        cf.INPUT("ID1Number","ID2NumberNewValue", driver, properties);
	
        cf.SELECTBYINDEX("ID1IssuingCountry",13, driver,properties);
        cf.SELECTBYINDEX("ID2IssuingCountry",13, driver,properties);
        
        WebElement ID1IssuingCountry=driver.findElement(By.xpath(properties.getProperty("ID1IssuingCountry")));
        ID1IssuingCountry.sendKeys(Keys.TAB);
        
        cf.INPUT("ID1ExpiryDate1New","ID1ExpiraryDate1Value", driver, properties);
        
        WebElement ID2IssuingCountry=driver.findElement(By.xpath(properties.getProperty("ID2IssuingCountry")));
        ID2IssuingCountry.sendKeys(Keys.TAB);
        
        cf.INPUT("ID2ExpiryDate2New","ID2ExpiraryDate2Value", driver, properties);
        
        cf.INPUT("RelativeNameNotLivingwithyou","RelativeNameNotLivingwithyouValue", driver, properties);
        cf.INPUT("Relationship","Relation", driver, properties);
        cf.INPUT("PhoneNumber","PhoneNumbervalue", driver, properties);
        cf.INPUT("AddressofRelative","AddressofRelativeLine1", driver, properties);
        cf.INPUT("AddressofRelative2","AddressofRelativeLine2", driver, properties);
        
        cf.SELECTBYINDEX("EmployementStatus",2, driver,properties);
        cf.SELECTBYINDEX("Occuption",14, driver,properties);
        cf.SELECTBYINDEX("IndustryCodes",14, driver,properties);
        
        cf.INPUT("JobTitle","JobTitleValue", driver, properties);
        cf.INPUT("EmployerName","EmployerNameValue", driver, properties);
        
        cf.SELECTBYINDEX("YearswithCurrentEmployer",6, driver,properties);
        
        cf.INPUT("CurrentEmployerAddress","CurrentEmployerAddressValue", driver, properties);
        
        cf.CLICK("ROUCNO", driver, properties);
        cf.CLICK("CustomerArreasNo", driver, properties);
        cf.CLICK("Save", driver, properties);
        cf.WAIT(5000, driver, properties);
        cf.CLICK("Continue", driver, properties);*/
		
		
	   

}}
