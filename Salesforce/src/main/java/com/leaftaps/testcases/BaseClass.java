package com.leaftaps.testcases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.utils.DataLibrary;
import com.framework.utils.Reporter;

public class BaseClass extends Reporter{
			public RemoteWebDriver driver;
			public String excelfilename;

	@BeforeMethod
	public void preCondition()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new  ChromeDriver(options);
		    System.out.println(driver);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		setNode();
		
	}
	
	@AfterMethod
	public void postCondition()
	{

		driver.close();
	}

		public void reportStep(String desc, String status) {
			reportStep(desc, status, true);
		}
	@DataProvider(name="passdata")
	public  Object[][] passData()
	{
		return new DataLibrary().readExcelData(excelfilename);
		
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		return 0;
	}
	@AfterSuite(alwaysRun = true)
	public synchronized void endResult() {
		try {
			if (getDriver() != null) {
				getDriver().quit();
			}
		} catch (UnreachableBrowserException e) {
		}
		extent.flush();
	}
}
