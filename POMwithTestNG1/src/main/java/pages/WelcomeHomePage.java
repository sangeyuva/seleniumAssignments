package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.baseClass;

public class WelcomeHomePage extends baseClass {
	
	public WelcomeHomePage(ChromeDriver driver) {
		this.driver = driver;
	}


	public void setdriver(ChromeDriver driver )
	{
		this.driver = driver;
	}
	
	
	public WelcomeHomePage homepage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		 if(text.contains("Welcome"))
		 
			 System.out.println("HomePage is displayed");
		 
		 
		
		 return this;
	}
	
	 public MyHomePage CRMSFALink() 
	 {
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 return new MyHomePage(driver);
		 
	}
}


