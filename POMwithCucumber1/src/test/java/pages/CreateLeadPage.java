package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage EnterCompName(String compName) {
		 WebElement mm = driver.findElement(By.id("createLeadForm_companyName"));
				 mm.sendKeys(compName);
				 String g= mm.getText();
		 return this;
	}
	
	public CreateLeadPage EnterFirstName(String fname) {
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
return this;
	}
	
	 public CreateLeadPage EnterLastName(String Lname) {
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
return this;
	}
	 
	 public CreateLeadPage EnterPhNo(String PhNo) {
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhNo);
		 return this;
	 }
	
	 public ViewLead ClickSubmit() {
		 driver.findElement(By.name("submitButton")).click();
		 return new ViewLead(driver);

	}
		
}

	
	

