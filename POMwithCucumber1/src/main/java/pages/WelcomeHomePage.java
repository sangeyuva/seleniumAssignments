package pages;

import org.openqa.selenium.By;

import Base.baseClass;

public class WelcomeHomePage extends baseClass {
	
	public WelcomeHomePage homepage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		 if(text.contains("Welcome"))
		 
			 System.out.println("HomePage is displayed");
		 
		 
		
		 return this;
	}
	
	 public MyHomePage CRMSFALink() 
	 {
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 return new MyHomePage();
		 
	}
}


