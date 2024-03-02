package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.baseClass;

public class MyHomePage extends baseClass {
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}


	
	public MyHomePage mylead() {
		String text = driver.findElement(By.tagName("div")).getText();
	//	System.out.println(text);
		return this;

	}
	
	 public MyLeadsPage ClickLeadsLink1() {
		 driver.findElement(By.linkText("Leads")).click();
		 return new MyLeadsPage(driver);
		 
	
	

}
}
