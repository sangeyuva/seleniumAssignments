package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.baseClass;
import pages.loginPage;

public class RunnerLogin extends baseClass {
	
	@BeforeTest
	public void  setValues()
	{
		excelfilename = "CreateLead1";
		excelsheetname = "login";
	}
	
	@Test(dataProvider = "Data")
	public void runLoginTestcase(String Uname, String pwd) {
	loginPage lp= new loginPage(driver);
		lp.userName(Uname).password(pwd).ClickLoginButton().homepage().CRMSFALink().mylead();
	}

}

