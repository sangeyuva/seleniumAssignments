package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.testcases.BaseClass;

public class LoginPage extends BaseClass{
	
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public HomePage clickLogin()
		{
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
				driver.findElement(By.id("password")).sendKeys("Testleaf@1234");
				driver.findElement(By.id("Login")).click();
				reportStep("Login is Succesful", "pass");
		return new HomePage(driver);
	}

}
