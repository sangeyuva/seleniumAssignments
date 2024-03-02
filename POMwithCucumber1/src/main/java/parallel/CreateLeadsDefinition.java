package parallel;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadsDefinition extends BaseClass {
	
	@When("clicked on CRMFSA link")
	 public void CRMSFALink() {
		 driver.findElement(By.linkText("CRM/SFA")).click();


	}
	 @And("click on Leads link")
	 public void ClickLeadsLink() {
		 driver.findElement(By.linkText("Leads")).click();

	}
	 @And("Click on Create Lead link")
	 public void ClickCreateLeadLink() {
		 driver.findElement(By.linkText("Create Lead")).click();
		
}
	 @Given("Enter the company name as (.*)$")
	 public void EnterCompName(String CompName) {
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompName);
		 
	}
	 @And("Enter first name (.*)$")
	 public void EnterFirstName(String fName) {
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	}
	 @And("Enter Last Name (.*)$")
	 public void EnterLastName(String lName) {
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

	}
	 
	 @And("Enter phone Number (.*)$")
	 public void EnterPhNo(String phNo) {
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		 
	 }
	 @Then("Click submit button")
	 public void ClickSubmit() {
		 driver.findElement(By.name("submitButton")).click();

	}
	 @Then("viewLead page should be displayed (.*)$")
	 public void VerifyViewLeadPage(String CompName1) {
		 String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 String hh = text.replaceAll("[\\d,(),\\s]","");
			Assert.assertEquals(CompName1, hh);
	}


}
