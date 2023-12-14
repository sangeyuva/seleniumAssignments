package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.testcases.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(RemoteWebDriver driver) {

		this.driver = driver;
	}

	public HomePage ClickIndividuals() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
//		 WebElement llp = driver.findElement(By.xpath("//span[text()='Individuals']"));
//		driver.executeScript("arguments[0].click();", llp);
		reportStep("Individual tab is clicked successfully", "pass");
		return this;
	}

	public IndividualDetailsPage newIndividualCreation(String fName, String lName) {
		driver.findElement(By.xpath("//div[@title='New']")).click();
		// WebElement clk = driver.findElement(By.xpath("//span[text()='New
		// Individual']"));
		// driver.executeScript("arguments[0].click();", clk);
		
		driver.findElement(By.xpath("//input[contains(@class,'firstName compound')]")).sendKeys(fName);
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(lName);
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		reportStep("New Individuals  is Created successfully", "pass");
		return new IndividualDetailsPage(driver);
	}

//	public HomePage SearchIndividuals(String searchName) throws InterruptedException {
//		WebElement name = driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
//		name.clear();
//		name.sendKeys(searchName);
//		name.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		return this;
//
//	}

	public HomePage editIndividuals(String searchName, String fName) throws InterruptedException {
		WebElement name = driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.clear();
		name.sendKeys(searchName);
		name.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
				WebElement ele = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", ele);
		Thread.sleep(3000);
		WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']/div"));
		driver.executeScript("arguments[0].click();", edit);
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[text()='Mr.']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).clear();
		driver.findElement(By.xpath("//input[contains(@class,'firstName')]")).sendKeys(fName);
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(2000);
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		// Verify the first name as ;'Ganesh'
		System.out.println(msg);
		reportStep("Individuals edited  successfully", "pass");
		return this;
	}
	
	public HomePage deleteIndividual(String searchName) throws InterruptedException
	{
		WebElement name = driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		name.clear();
		name.sendKeys(searchName);
		name.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement pop = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", pop);////div[@class='uiPopupTrigger']
		//Thread.sleep(2000);
		WebElement delete = driver.findElement(By.xpath("//a[@role='menuitem']/div[@title='Delete']"));
		driver.executeScript("arguments[0].click();", delete);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		 System.out.println(msg);
		 reportStep("Individuals deleted successfully", "pass");
		 return this;
	}
	
	public HomePage verifyDelete()
	{
		String verify = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		//Verify Whether Individual is Deleted using Individual last name"
		System.out.println(verify);
		reportStep("Deletion verified successfully", "pass");
		return this;
		
	}
}