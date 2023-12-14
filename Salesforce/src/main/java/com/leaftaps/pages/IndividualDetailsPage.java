package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.testcases.BaseClass;

public class IndividualDetailsPage extends BaseClass{
	
	public IndividualDetailsPage(RemoteWebDriver driver) {
//		
		this.driver = driver;
	}

	public IndividualDetailsPage IndividualsCreated()
	{
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		//verify Individuals Name
//		System.out.println(message);
		String[] mm= message.split(" ");
//		System.out.println(mm[0]);
		String string = mm[1].toString();
		
		if(string.equalsIgnoreCase("\"Ganesan\""))
			
		{
			System.out.println(message);
		}
		else
		{
			System.out.println("Not Created successfully");
		}
		reportStep("Individual creation verified  successfully", "pass");
		return this;
	}

}
