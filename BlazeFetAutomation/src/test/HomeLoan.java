package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class HomeLoan extends CommFunc {

	CommFunc cf = new CommFunc();
	
	public void START() throws Exception
 {
		cf.CLICK("Login", driver, properties);
		cf.WAIT(2000, driver, properties);
		
		cf.CLICK("NewApplication", driver, properties);
		cf.WAIT(2000, driver, properties);
        
        cf.CLICK("Individual",driver,properties);
        cf.CLICK("Individual",driver,properties);
		
		cf.SELECTBYINDEX("ApplicationType",1, driver,properties);
		//cf.SELECTBYINDEX("NumberOfApplicants",1, driver,properties);
		//cf.SELECTBYINDEX("Guarantors",0, driver,properties);
		
		//APPLICANT_1		
		cf.CLICK("Applicant1Expand",driver,properties);		
	 	
	 	cf.SELECTBYINDEX("CustomerType",1, driver,properties);
	 	
		
		cf.CLICK("New", driver, properties);
		cf.CLICK("New", driver, properties);
		
		
		cf.SELECTBYINDEX("title",1, driver,properties);
		
		cf.INPUT("FirstName","FirstNamevalue", driver, properties);
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
        cf.CLICK("Continue", driver, properties);
                    
        cf.WAIT(2000, driver, properties);
        
        //FacilityDetails       
        cf.SELECTBYINDEX("ProductType",2, driver, properties);
        cf.SELECTBYINDEX("FacilityType",1, driver, properties);
        
        cf.CLICK("FacilityCatogary", driver, properties);
        cf.CLICK("FacilityCatogary", driver, properties);
        
        cf.SELECTBYINDEX("InterestRateType", 2, driver, properties);
        
        cf.CLEAR("Discount", driver, properties);
        cf.INPUT("Discount", "DiscountValue", driver, properties);                      
        
        cf.SELECTBYINDEX("IRDiscountApprovedBy",1, driver, properties);
        
        cf.CLEAR("LoanTerm", driver, properties);
        cf.INPUT("LoanTerm", "LoanTermValue", driver, properties);
  
        cf.SELECTBYVALUE("RepaymentFreq","RepaymentFreqValue", driver, properties);
        cf.SELECTBYINDEX("RepaymentMethod",1, driver, properties);
        
        cf.CLICK("IsInterestOnlyLoan", driver, properties);        
        cf.CLICK("LoanMaturity", driver, properties);
        
        cf.SELECTBYINDEX("LoanPurpose",1, driver, properties);
        cf.SELECTBYINDEX("LoanPurposeDetail",1, driver, properties);
        
        cf.CLEAR("PurposeAmount", driver, properties);
        cf.INPUT("PurposeAmount", "PurposeAmountValue", driver, properties);
        
        cf.CLEAR("ProvidentFundEquity", driver, properties);
        cf.INPUT("ProvidentFundEquity", "ProvidentFundEquityValue", driver, properties);
                
        cf.CLEAR("GovernmentGrantFiji", driver, properties);
        cf.INPUT("GovernmentGrantFiji", "GovernmentGrantFijiValue", driver, properties);
                       
        cf.CLEAR("DeedOfGiftEquity", driver, properties);
        cf.INPUT("DeedOfGiftEquity", "DeedOfGiftEquityValue", driver, properties);
        
        cf.CLEAR("CashContribution", driver, properties);
        cf.INPUT("CashContribution", "CashContributionValue", driver, properties);
        
        cf.CLEAR("SolicitorsCost", driver, properties);
        cf.INPUT("SolicitorsCost", "SolicitorsCostValue", driver, properties);
        
        cf.CLEAR("OtherContributions", driver, properties);
        cf.INPUT("OtherContributions", "OtherContributionsValue", driver, properties);
        
        cf.CLEAR("StampDutyCost", driver, properties);
        cf.INPUT("StampDutyCost", "StampDutyCostValue", driver, properties);
        
        //cf.CLEAR("ContributionTradeInValue", driver, properties);
        //cf.INPUT("ContributionTradeInValue", "ContributionTradeInValueValue", driver, properties);
        
        cf.CLEAR("OtherCosts", driver, properties);
        cf.INPUT("OtherCosts", "OtherCostsValue", driver, properties);
        
        cf.CLICK("OwnSource", driver, properties);
        cf.CLICK("OwnSource", driver, properties);
        
        cf.CLEAR("LoanApprovalFee", driver, properties);
        cf.INPUT("LoanApprovalFee", "LoanApprovalFeeValue", driver, properties);
        
        cf.SELECTBYINDEX("LAFDiscount",3, driver, properties);
         
        cf.WAIT(1000, driver, properties);
        cf.CLICK("Save", driver, properties);
        cf.WAIT(5000, driver, properties);
        cf.CLICK("Continue", driver, properties);
        
        //SecurityDetails
        cf.SELECTBYINDEX("SecurityType", 4, driver, properties);
        
        cf.CLICK("NewSD", driver, properties);
        cf.CLICK("NewSD", driver, properties);
                
        cf.CLICK("AppicantRelatedtoSecurity", driver, properties);
        cf.CLICK("AppicantRelatedtoSecurityOption", driver, properties);
        
        cf.CLICK("TypeOfMotorVehicleOld", driver, properties);
        cf.CLICK("TypeOfMotorVehicleOld", driver, properties);
        
        cf.INPUT("MotorVehiclesRegistrationNum","MotorVehiclesRegistrationNumValue", driver, properties);
        cf.INPUT("FairMarketVal","FairMarketValue", driver, properties);
        
        cf.WAIT(1000, driver, properties);
        
        cf.CLICK("Continue", driver, properties);
        
        //FinanceDetails        		
        cf.CLICK("IncomeDetailsExpand", driver, properties);
        
        cf.WAIT(1000, driver, properties);
               
        cf.SELECTBYINDEX("IncomeType1", 1, driver, properties);
        
        cf.CLEAR("GrossMon1", driver, properties);
        cf.INPUT("GrossMon1","GM1Value", driver, properties);
        
        cf.CLEAR("NetMon1", driver, properties);
        cf.INPUT("NetMon1","NM1Value", driver, properties);
        
        cf.CLICK("AddIncome", driver, properties);
        
        cf.SELECTBYINDEX("IncomeType2", 2, driver, properties);
        
        cf.CLEAR("GrossMon2", driver, properties);
        cf.INPUT("GrossMon2","GM2Value", driver, properties);
        
        cf.CLEAR("Deductions", driver, properties);
        cf.INPUT("Deductions","dedValue", driver, properties);
        
        cf.WAIT(2000, driver, properties);
        
        cf.SELECTBYINDEX("ExpDetailsRental", 3, driver, properties);
        cf.SELECTBYINDEX("ExpDetailsFood", 3, driver, properties);
        
        cf.CLEAR("RentalAmount", driver, properties);
        cf.INPUT("RentalAmount", "RAValue", driver, properties);
        
        cf.CLEAR("FoodAmount", driver, properties);
        cf.INPUT("FoodAmount", "FAValue", driver, properties); 
        
        cf.CLICK("DEAdd", driver, properties);
        
        cf.SELECTBYINDEX("DEExpenseType",2, driver, properties);
        cf.SELECTBYINDEX("DEOExpenseType",6, driver, properties);
        cf.SELECTBYINDEX("DEExpenseFreq",3, driver, properties);
        cf.SELECTBYINDEX("DEOExpenseFreq",3, driver, properties);
        
        cf.INPUT("DEGrossAmount","DEGAValue1", driver, properties);
        cf.INPUT("DEOGrossAmount","DEGAValue2", driver, properties);
        cf.INPUT("DEOthers","DEOValue", driver, properties);
        
        cf.CLICK("SEAdd", driver, properties);
        
        cf.SELECTBYINDEX("SEExpenseType",1, driver, properties);
        cf.SELECTBYINDEX("SEOExpenseType",4, driver, properties);
        cf.SELECTBYINDEX("SEExpenseFreq",4, driver, properties);
        cf.SELECTBYINDEX("SEOExpenseFreq",3, driver, properties);
        
        cf.INPUT("SEGrossAmount","SEGAValue1", driver, properties);
        cf.INPUT("SEOGrossAmount","SEGAValue2", driver, properties);
        cf.INPUT("SEOthers","SEOValue", driver, properties);
                   
        cf.CLICK("Continue", driver, properties);
        cf.WAIT(2000, driver, properties);
        
        cf.CLICK("Continue", driver, properties);
        cf.CLICK("Submit", driver, properties);
        
        cf.WAIT(2000, driver, properties);
        String value= cf.ALERT("ok", driver, properties);
        System.out.println(value);
}
}


