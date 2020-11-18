package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class Dummy extends CommFunc {

	CommFunc cf = new CommFunc();	
	
	public void Verifying() throws Exception
	{
		
		
		cf.DOUBLECLICK(action,"Joint" , driver, properties);
		
		cf.SELECTBYINDEX("ApplicationType",1, driver,properties);
		cf.SELECTBYINDEX("NumberOfApplicants",2, driver,properties);
		cf.SELECTBYINDEX("Guarantors",2, driver,properties);
		
		//APPLICANT_1		
		cf.CLICK("Applicant1Expand",driver,properties);		
	 		 	
	 	cf.SELECTBYINDEX("CustomerType",1, driver,properties);
	 	
		cf.DOUBLECLICK(action,"New" , driver, properties);
		
		cf.SELECTBYINDEX("title",1, driver,properties);
		
		cf.INPUT("FirstName","FirstNamevalue", driver, properties);
		cf.INPUT("lastname","LastNameValue", driver, properties);
		cf.INPUT("DOB","DOBValue1", driver, properties);
		cf.INPUT("ContactNumber1","ContactNumber1Value", driver, properties);
		cf.INPUT("ContactNumber2","ContactNumber2Value", driver, properties);
		cf.INPUT("Emailaddress","Emailaddressvalue", driver, properties);
		
		cf.SELECTBYINDEX("ResidentialStatus",1, driver,properties);
		
        cf.DOUBLECLICK(action,"PEP" , driver, properties);
        
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
        
        cf.SELECTBYINDEX("Occuption",14, driver,properties);
        cf.SELECTBYINDEX("IndustryCodes",14, driver,properties);
        
        //Applicant_2
        cf.CLICK("Applicant2Expand",driver,properties);		
		 	
	 	cf.SELECTBYINDEX("CustomerType2",1, driver,properties);
	 	
		cf.DOUBLECLICK(action,"New2" , driver, properties);
		
		cf.SELECTBYINDEX("title2",1, driver,properties);
		
		cf.INPUT("FirstName2","FirstNamevalue", driver, properties);
		cf.INPUT("lastname2","LastNameValue", driver, properties);
		cf.INPUT("DOB2","DOBValue1", driver, properties);
		cf.INPUT("ContactNumber12","ContactNumber1Value", driver, properties);
		cf.INPUT("ContactNumber22","ContactNumber2Value", driver, properties);
		cf.INPUT("Emailaddress2","Emailaddressvalue", driver, properties);
		
		cf.SELECTBYINDEX("ResidentialStatus2",1, driver,properties);
		
        cf.DOUBLECLICK(action,"PEP2" , driver, properties);
        
        cf.SELECTBYINDEX("Years2",3, driver,properties);
        cf.SELECTBYINDEX("Month2",3, driver,properties);
        
        cf.INPUT("currentaddressline12","currentaddressline1Value", driver, properties);
        cf.INPUT("currentaddressline22","currentaddressline2Value", driver, properties);
        
        cf.SELECTBYINDEX("LivingSituation2",3, driver,properties);
        
        cf.INPUT("PostalAddressLine12","PostalAddressLine1Value", driver, properties);
        cf.INPUT("PostalAddressLine22","PostalAddressLine2Value", driver, properties);
        
        cf.SELECTBYINDEX("MaritalStatus2",2, driver,properties);
        
        cf.CLEAR("NumberofDependentsAdults2", driver, properties);
        cf.INPUT("NumberofDependentsAdults2","NumberofDependentsAdulltsValue", driver, properties);
        
        cf.CLEAR("NumberofDependentsChildrens2", driver, properties);
        cf.INPUT("NumberofDependentsChildrens2","NumberofDependentsChildrensValue", driver, properties);
        
        cf.CLEAR("NumberofMotorVehicles2", driver, properties);
        cf.INPUT("NumberofMotorVehicles2","NumberofMotorVehiclesValue", driver, properties);
        
        cf.SELECTBYINDEX("LivingWorking2",2, driver,properties);
        cf.SELECTBYINDEX("Countryofbirth2",13, driver,properties);
        cf.SELECTBYINDEX("CitizenshipNew2",13, driver,properties);
        
        cf.INPUT("ID1Name2","ID1NameNewValue", driver, properties);
        cf.INPUT("ID2Name2","ID2NameNewValue", driver, properties);
        cf.INPUT("ID2Number2","ID1NumberNewValue", driver, properties);
        cf.INPUT("ID1Number2","ID2NumberNewValue", driver, properties);
	
        cf.SELECTBYINDEX("ID1IssuingCountry2",13, driver,properties);
        cf.SELECTBYINDEX("ID2IssuingCountry2",13, driver,properties);
        
        WebElement ID1IssuingCountry2=driver.findElement(By.xpath(properties.getProperty("ID1IssuingCountry2")));
        ID1IssuingCountry2.sendKeys(Keys.TAB);
        
        cf.INPUT("ID1ExpiryDate1New2","ID1ExpiraryDate1Value", driver, properties);
        
        WebElement ID2IssuingCountry2=driver.findElement(By.xpath(properties.getProperty("ID2IssuingCountry2")));
        ID2IssuingCountry2.sendKeys(Keys.TAB);
        
        cf.INPUT("ID2ExpiryDate2New2","ID2ExpiraryDate2Value", driver, properties);
        
        cf.INPUT("RelativeNameNotLivingwithyou2","RelativeNameNotLivingwithyouValue", driver, properties);
        cf.INPUT("Relationship2","Relation", driver, properties);
        cf.INPUT("PhoneNumber2","PhoneNumbervalue", driver, properties);
        cf.INPUT("AddressofRelative02","AddressofRelativeLine1", driver, properties);
        cf.INPUT("AddressofRelative022","AddressofRelativeLine2", driver, properties);
        
        cf.SELECTBYINDEX("Occuption2",14, driver,properties);
        cf.SELECTBYINDEX("IndustryCodes2",14, driver,properties);
        
      //GURANTORS
        cf.CLICK("GurantorsExpand",driver,properties);		
	 	
        cf.DOUBLECLICK(action,"Guarantor" , driver, properties);        		
		cf.DOUBLECLICK(action,"GNew" , driver, properties);
		
		cf.SELECTBYINDEX("Gtitle",1, driver,properties);
		
		cf.INPUT("GFirstName","FirstNamevalue", driver, properties);
		cf.INPUT("Glastname","LastNameValue", driver, properties);
		cf.INPUT("GDOB","DOBValue1", driver, properties);
		cf.INPUT("GContactNumber1","ContactNumber1Value", driver, properties);
		cf.INPUT("GContactNumber2","ContactNumber2Value", driver, properties);
		cf.INPUT("GEmailaddress","Emailaddressvalue", driver, properties);
		
		cf.SELECTBYINDEX("GResidentialStatus",1, driver,properties);
				       
        cf.DOUBLECLICK(action,"GPEP" , driver, properties);
        
        cf.SELECTBYINDEX("GYears",3, driver,properties);
        cf.SELECTBYINDEX("GMonth",3, driver,properties);
        
        cf.INPUT("Gcurrentaddressline1","currentaddressline1Value", driver, properties);
        cf.INPUT("Gcurrentaddressline2","currentaddressline2Value", driver, properties);
        
        cf.SELECTBYINDEX("GLivingSituation",3, driver,properties);
        
        cf.INPUT("GPostalAddressLine1","PostalAddressLine1Value", driver, properties);
        cf.INPUT("GPostalAddressLine2","PostalAddressLine2Value", driver, properties);
        
        cf.SELECTBYINDEX("GMaritalStatus",2, driver,properties);
        
                
        cf.CLEAR("GNumberofDependentsAdults", driver, properties);
        cf.INPUT("GNumberofDependentsAdults","NumberofDependentsAdulltsValue", driver, properties);
        
        cf.CLEAR("GNumberofDependentsChildrens", driver, properties);
        cf.INPUT("GNumberofDependentsChildrens","NumberofDependentsChildrensValue", driver, properties);
        
        cf.CLEAR("GNumberofMotorVehicles", driver, properties);
        cf.INPUT("GNumberofMotorVehicles","NumberofMotorVehiclesValue", driver, properties);
        
        cf.SELECTBYINDEX("GLivingWorking",2, driver,properties);
        cf.SELECTBYINDEX("GCountryofbirth",13, driver,properties);
        cf.SELECTBYINDEX("GCitizenshipNew",13, driver,properties);
        
        cf.INPUT("GID1Name","ID1NameNewValue", driver, properties);
        cf.INPUT("GID2Name","ID2NameNewValue", driver, properties);
        cf.INPUT("GID2Number","ID1NumberNewValue", driver, properties);
        cf.INPUT("GID1Number","ID2NumberNewValue", driver, properties);
	
        cf.SELECTBYINDEX("GID1IssuingCountry",13, driver,properties);
        cf.SELECTBYINDEX("GID2IssuingCountry",13, driver,properties);
        
        WebElement GID1IssuingCountry=driver.findElement(By.xpath(properties.getProperty("ID1IssuingCountry")));
        GID1IssuingCountry.sendKeys(Keys.TAB);
        
        cf.INPUT("GID1ExpiryDate1New","ID1ExpiraryDate1Value", driver, properties);
        
        WebElement GID2IssuingCountry=driver.findElement(By.xpath(properties.getProperty("ID2IssuingCountry")));
        GID2IssuingCountry.sendKeys(Keys.TAB);
        
        cf.INPUT("GID2ExpiryDate2New","ID2ExpiraryDate2Value", driver, properties);
        
        cf.INPUT("GRelativeNameNotLivingwithyou","RelativeNameNotLivingwithyouValue", driver, properties);
        cf.INPUT("GRelationship","Relation", driver, properties);
        cf.INPUT("GPhoneNumber","PhoneNumbervalue", driver, properties);
        cf.INPUT("GAddressofRelative","AddressofRelativeLine1", driver, properties);
        cf.INPUT("GAddressofRelative2","AddressofRelativeLine2", driver, properties);
        
        cf.SELECTBYINDEX("GOccuption",14, driver,properties);
        cf.SELECTBYINDEX("GIndustryCodes",14, driver,properties);
        
        cf.CLICK("Continue", driver, properties);
        
}}
