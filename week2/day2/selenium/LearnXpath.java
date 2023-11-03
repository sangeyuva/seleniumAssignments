package week2.day2.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {
	
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String str =  driver.getTitle();
		System.out.println(str);
		
		//locate username field
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");;
				
		//Locate Password field
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		//click login 
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//click link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//click lead link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//click create link
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_companyName')]")).sendKeys("sanuya");
		
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_firstName')]")).sendKeys("sangeetha");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_lastName')]")).sendKeys("Ganesan");
		
		WebElement   industry =          driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		Select options = new Select (industry);
		options.selectByIndex(5);
	//	String str2 = options.selectByIndex(0).gettext();
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String name = driver.getTitle();
		
		System.out.println(name);
		
		
		
		
		
		
		

}
}
