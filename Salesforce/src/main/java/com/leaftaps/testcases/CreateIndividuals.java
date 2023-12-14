package com.leaftaps.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;

public class CreateIndividuals extends BaseClass {
	@BeforeTest
	public void setValue()
	{
		excelfilename="CreateLead";
		testcaseName = "Create Individuals";
		testDescription ="Verify Creation of  Individuals with positive data";
		category ="Regression";
	}
	/*
	 * "Test Steps: 1. Login to https://login.salesforce.com 2. Click on the toggle
	 * menu button from the left corner 3. Click View All and click Individuals from
	 * App Launcher 4. Click on the Dropdown icon in the Individuals tab 5. Click on
	 * New Individual 6. Enter the Last Name as 'Kumar' 7.Click save and verify
	 * Individuals Name"
	 * 	
	 */
	@Test(dataProvider = "passdata")
	public void CreateIndividuals(String fName, String lName) {
		LoginPage lp = new LoginPage(driver);
		lp.clickLogin().ClickIndividuals().newIndividualCreation(fName, lName);

	}
}