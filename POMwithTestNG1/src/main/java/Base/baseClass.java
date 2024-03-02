package Base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Utils.readDataFromExcel;


public   class baseClass {

	public ChromeDriver driver;

public String excelfilename;
public String excelsheetname;




	
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
		driver.close();
	}
	
	
	@DataProvider(name="Data")
	public String[][] passData() throws IOException
	{
		return readDataFromExcel.readExcelData(excelfilename, excelsheetname);
		
		
	}
	
}
