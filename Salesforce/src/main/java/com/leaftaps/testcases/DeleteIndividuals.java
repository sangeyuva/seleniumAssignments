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



public class DeleteIndividuals extends BaseClass{
	@BeforeTest
	public void setValue()
	{
		excelfilename="DeleteLead";
		testcaseName = "Delete Individuals";
		testDescription ="Verify Deletion of Individuals";
		category ="Smoke";
	}

	@Test(dataProvider = "passdata")
	public  void DeleteIndividuals(String searchName) throws InterruptedException {
		/*
		 * "Test Steps:
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Individuals from App Launcher
4. Click on the Individuals tab 
5. Search the Individuals 'Kumar'
6. Click on the Dropdown icon and Select Delete
7.Click on the Delete option in the displayed popup window.
8. Verify Whether Individual is Deleted using Individual last name"

		 */
		LoginPage lp = new LoginPage(driver);
		lp.clickLogin().ClickIndividuals().deleteIndividual(searchName).verifyDelete();
		
	}

}
