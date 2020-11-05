package test;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class General {
	@Test
	public void START() throws Exception
 {
	FileInputStream fis = new FileInputStream(
			"C:\\Users\\chauhaa4\\EC_workspace\\BlazeFetAutomation\\Config.properties");
    Properties properties = new Properties();
    properties.load(fis);
    
    System.setProperty("webdriver.chrome.driver","C://Users/chauhaa4/EC_workspace/Topgear/driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
  
}
}
