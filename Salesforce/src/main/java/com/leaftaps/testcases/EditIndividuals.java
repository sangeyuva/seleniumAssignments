package com.leaftaps.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;

public class EditIndividuals extends BaseClass {
	
	@BeforeTest
	public void setValue()
	{
		excelfilename="EditLead";
		testcaseName = "Edit Individuals";
		testDescription ="Verify Edit Individuals with positive data";
		category ="Smoke";
	}

	@Test(dataProvider = "passdata")
	public void EditIndividuals(String searchName, String fName) throws InterruptedException {
		/*
		 * "Test Steps: 1. Login to https://login.salesforce.com 2. Click on the toggle
		 * menu button from the left corner 3. Click View All and click Individuals from
		 * App Launcher 4. Click on the Individuals tab 5. Search the Individuals
		 * 'Kumar' 6. Click on the Dropdown icon and Select Edit 7.Select Salutation as
		 * 'Mr' 8.Enter the first name as 'Ganesh'. 9. Click on Save and Verify the
		 * first name as 'Ganesh'"
		 * 
		 */
		LoginPage lp = new LoginPage(driver);
		lp.clickLogin().ClickIndividuals().editIndividuals(searchName, fName);
	}
}
