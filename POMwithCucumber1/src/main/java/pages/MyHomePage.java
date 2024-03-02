package pages;

import org.openqa.selenium.By;

import Base.baseClass;

public class MyHomePage extends baseClass {
	
	public MyHomePage mylead() {
		String text = driver.findElement(By.tagName("div")).getText();
	//	System.out.println(text);
		return this;

	}
	
	 public MyLeadsPage ClickLeadsLink1() {
		 driver.findElement(By.linkText("Leads")).click();
		 return new MyLeadsPage();
		 
	
	

}
}
