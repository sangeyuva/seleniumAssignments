package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{
	
	@Given("Launch browser")
	public void launchBrowser() {
	 driver = new ChromeDriver();

	}
	
	@Given("load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	@Given("enter the username as {string}")
	public void EnterUsername(String Uname) {
		driver.findElement(By.id("username")).sendKeys(Uname);

	}
	
	@And("enter the password as {string}")
	public void EnterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);

	}
	
	@When("click on Login button")
	public void ClickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	@Then("homepage should be displayed")
	public void VerifyHomePage() {
		 String text = driver.findElement(By.tagName("h2")).getText();
		 if(text.contains("Welcome"))
		 {
			 System.out.println("HomePage is displayed");
		 }
		 
		 else
		 {
			 System.out.println("HomePage not shown");
		 }
	}
		 
		 @Then("Error Message should be displayed")
			public void VerifyErrorMessage() {
				 String text = driver.findElement(By.id("errorDiv")).getText();
				System.out.println(text);


}
}

