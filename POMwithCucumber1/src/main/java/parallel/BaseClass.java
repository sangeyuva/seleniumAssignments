package parallel;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Utils.readDataFromExcel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;
	public String excelfilename;
	
	@BeforeMethod
	public void preCondition()
	{
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}
	
	@DataProvider(name="Data", parallel = true)
	public Object[][] passData() throws IOException
	{
		
		return readDataFromExcel.readExcelData(excelfilename);
		
		
	    
		
		
	}
}


