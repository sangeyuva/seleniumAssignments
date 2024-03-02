package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.baseClass;
import pages.CreateLeadPage;
import pages.MyLeadsPage;
import pages.loginPage;

public class RunnerCreateLead extends baseClass{
	
	@BeforeTest
	public void  setValues()
	{
		excelfilename = "CreateLead1";
		excelsheetname = "Sheet1";
	}
	
	
	
	@Test(dataProvider = "Data")
	public void runCreateLeadtest(String Uname, String pwd,String compName, String fname, String lname, String PhNo) {
				loginPage lp= new loginPage(driver);
		lp.userName(Uname).password(pwd).ClickLoginButton().homepage().CRMSFALink().mylead()
		.ClickLeadsLink1().ClickLeadsLink().EnterCompName(compName).EnterFirstName(fname).EnterLastName(lname)
		.EnterPhNo(PhNo).ClickSubmit().viewlead();
		
		
	
		

	}

	
}
