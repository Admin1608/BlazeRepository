package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class SampleTest extends BaseClass {
	
	@Test
	public void Creditcardunsecuredmethod() throws Exception
	{
	
		Actions action=new Actions(driver);
		WebElement Individual=driver.findElement(By.xpath(properties.getProperty("Joint")));
		action.doubleClick(Individual).build().perform();
		WebElement ApplicationType=driver.findElement(By.xpath(properties.getProperty("ApplicationType")));
		Select select=new Select(ApplicationType);
		select.selectByIndex(1);
		
		WebElement NumberOfApplicants=driver.findElement(By.xpath(properties.getProperty("NumberOfApplicants")));
    	Select NOA=new Select(NumberOfApplicants);
		NOA.selectByIndex(2);
		
		WebElement Guarantors=driver.findElement(By.xpath(properties.getProperty("Guarantors")));
		Select select1=new Select(Guarantors);
		select1.selectByIndex(0);
		driver.findElement(By.xpath(properties.getProperty("Applicant1Expand"))).click();
		WebElement CustomerType=driver.findElement(By.xpath(properties.getProperty("CustomerType")));
		Select customertype=new Select(CustomerType);
		customertype.selectByIndex(1);
		
		WebElement New= driver.findElement(By.xpath(properties.getProperty("New")));
		action.doubleClick(New).build().perform();
		WebElement title=driver.findElement(By.xpath(properties.getProperty("title")));
		Select Title=new Select(title);
		Title.selectByIndex(1);
		driver.findElement(By.xpath(properties.getProperty("FirstName"))).sendKeys(properties.getProperty("FirstNamevalue"));
		driver.findElement(By.xpath(properties.getProperty("lastname"))).sendKeys(properties.getProperty("LastNameValue"));
		driver.findElement(By.xpath(properties.getProperty("DOB"))).sendKeys(properties.getProperty("DOBValue1"));
		driver.findElement(By.xpath(properties.getProperty("ContactNumber1"))).sendKeys(properties.getProperty("ContactNumber1Value"));
		driver.findElement(By.xpath(properties.getProperty("ContactNumber2"))).sendKeys(properties.getProperty("ContactNumber2Value"));
		driver.findElement(By.xpath(properties.getProperty("Emailaddress"))).sendKeys(properties.getProperty("Emailaddressvalue"));
		WebElement ResidentialStatus=driver.findElement(By.xpath(properties.getProperty("ResidentialStatus")));
		Select RS=new Select(ResidentialStatus);
		RS.selectByIndex(1);
		WebElement PEP=driver.findElement(By.xpath(properties.getProperty("PEP")));
        action.doubleClick(PEP).build().perform();
		WebElement Years=driver.findElement(By.xpath(properties.getProperty("Years")));
		Select YR=new Select(Years);
		YR.selectByIndex(3);
		WebElement Month=driver.findElement(By.xpath(properties.getProperty("Month")));
		Select month=new Select(Month);
		month.selectByIndex(3);
		driver.findElement(By.xpath(properties.getProperty("currentaddressline1"))).sendKeys(properties.getProperty("currentaddressline1Value"));
		driver.findElement(By.xpath(properties.getProperty("currentaddressline2"))).sendKeys(properties.getProperty("currentaddressline2Value"));
		WebElement LivingSituation=driver.findElement(By.xpath(properties.getProperty("LivingSituation")));
		Select LS=new Select(LivingSituation);
		LS.selectByIndex(3);
		driver.findElement(By.xpath(properties.getProperty("PostalAddressLine1"))).sendKeys(properties.getProperty("PostalAddressLine1Value"));
		driver.findElement(By.xpath(properties.getProperty("PostalAddressLine2"))).sendKeys(properties.getProperty("PostalAddressLine2Value"));
		WebElement MaritalStatus=driver.findElement(By.xpath(properties.getProperty("MaritalStatus")));
		Select MS=new Select(MaritalStatus);
		MS.selectByIndex(2);
		
		driver.findElement(By.xpath(properties.getProperty("NumberofDependentsAdults"))).sendKeys(properties.getProperty("NumberofDependentsAdulltsValue"));
		driver.findElement(By.xpath(properties.getProperty("NumberofDependentsChildrens"))).sendKeys(properties.getProperty("NumberofDependentsChildrensValue"));
		WebElement LivingWorking=driver.findElement(By.xpath(properties.getProperty("LivingWorking")));
		Select LW=new Select(LivingWorking);
		LW.selectByIndex(2);
		Thread.sleep(3000);
				
		WebElement Countryofbirth=driver.findElement(By.xpath(properties.getProperty("Countryofbirth")));
		Select COB=new Select(Countryofbirth);
		COB.selectByIndex(13);
		WebElement CitizenshipNew=driver.findElement(By.xpath(properties.getProperty("CitizenshipNew")));
		Select CZ=new Select(CitizenshipNew);
		CZ.selectByIndex(13);
		
		driver.findElement(By.xpath(properties.getProperty("ID1Name"))).sendKeys(properties.getProperty("ID1NameNewValue"));
		driver.findElement(By.xpath(properties.getProperty("ID2Name"))).sendKeys(properties.getProperty("ID2NameNewValue"));
		driver.findElement(By.xpath(properties.getProperty("ID1Number"))).sendKeys(properties.getProperty("ID1NumberNewValue"));
		driver.findElement(By.xpath(properties.getProperty("ID2Number"))).sendKeys(properties.getProperty("ID2NumberNewValue"));

		WebElement ID1IssuingCountry=driver.findElement(By.xpath(properties.getProperty("ID1IssuingCountry")));
		Select ID1Issue=new Select(ID1IssuingCountry);
		ID1Issue.selectByIndex(13);
		WebElement ID2IssuingCountry=driver.findElement(By.xpath(properties.getProperty("ID2IssuingCountry")));
    	Select ID2Issue=new Select(ID2IssuingCountry);
		ID2Issue.selectByIndex(13);
		
		ID1IssuingCountry.click();
		ID1IssuingCountry.sendKeys(Keys.TAB);
		//driver.findElement(By.xpath(properties.getProperty("ID1ExpiryDate1New"))).clear();
		driver.findElement(By.xpath(properties.getProperty("ID1ExpiryDate1New"))).sendKeys(properties.getProperty("ID1ExpiraryDate1Value"));
        
		ID2IssuingCountry.click();
	    ID2IssuingCountry.sendKeys(Keys.TAB);
		//driver.findElement(By.xpath(properties.getProperty("ID2ExpiryDate2New"))).clear();
		driver.findElement(By.xpath(properties.getProperty("ID2ExpiryDate2New"))).sendKeys(properties.getProperty("ID2ExpiraryDate2Value"));
		
		driver.findElement(By.xpath(properties.getProperty("RelativeNameNotLivingwithyou"))).sendKeys(properties.getProperty("RelativeNameNotLivingwithyouValue"));
		driver.findElement(By.xpath(properties.getProperty("Relationship"))).sendKeys(properties.getProperty("Relation"));
		driver.findElement(By.xpath(properties.getProperty("PhoneNumber"))).sendKeys(properties.getProperty("PhoneNumbervalue"));
		driver.findElement(By.xpath(properties.getProperty("AddressofRelative"))).sendKeys(properties.getProperty("AddressofRelativeLine1"));
		driver.findElement(By.xpath(properties.getProperty("AddressofRelative2"))).sendKeys(properties.getProperty("AddressofRelativeLine2"));
		WebElement Occuption=driver.findElement(By.xpath(properties.getProperty("Occuption")));
    	Select OCC=new Select(Occuption);
		OCC.selectByIndex(14);
		WebElement IndustryCodes=driver.findElement(By.xpath(properties.getProperty("IndustryCodes")));
    	Select IC=new Select(IndustryCodes);
		IC.selectByIndex(14);
		
		
	   

}}
