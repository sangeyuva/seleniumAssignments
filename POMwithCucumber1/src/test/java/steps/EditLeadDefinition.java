package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadDefinition extends BaseClass {
	 @When("click on FindLeads Link")
	 public void ClickFindLeadsLink() {
		 driver.findElement(By.linkText("Find Leads")).click();

	}
	 @And("Search leads by Phone Number (.*)$")
	 public void searchLeadsByPhno(String phNo) {
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);

	}
	 @And("Click on findLeads button")
	 public void ClickFindLeadButton() throws InterruptedException {
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);

	}
	 @And("Click on Edit Leads button")
	 public void EditLeadLinkClick() {
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Edit")).click();

	}
	 @And("Update Company Name (.*)$")
	 public void updateCompName(String compName3) {
		 WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
			companyName.clear();
			companyName.sendKeys(compName3);

	
	}
	 @When("click on Submit button")
	 public void SubmitClick() {
		 driver.findElement(By.name("submitButton")).click();

	}
	 
	 @Then("Verify lead is edited (.*)$")
	 public void verify_lead_is_edited(String compName3) {
		
		 String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 String hh = text.replaceAll("[\\d,(),\\s]","");
		 
		 Assert.assertEquals(hh,compName3);
		 System.out.println("Lead Edited Successfully");
		 

	}
}



