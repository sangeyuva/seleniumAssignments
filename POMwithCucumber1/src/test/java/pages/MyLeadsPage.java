package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.baseClass;
import steps.BaseClass;

public class MyLeadsPage extends BaseClass {
	
	
	public MyLeadsPage(ChromeDriver driver) 
	{
		this.driver = driver;
	}
	public CreateLeadPage ClickLeadsLink() {
		 
			 driver.findElement(By.linkText("Create Lead")).click();
			return new CreateLeadPage(driver);
			
		 }
	
}


		 
