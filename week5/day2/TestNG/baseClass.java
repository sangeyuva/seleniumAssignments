package week5.day2.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class baseClass {
	
	public ChromeDriver driver;
	@Parameters({"url","Username","Password"})
	@BeforeMethod
	public void Precondition(String url, String Uname, String pwd)
	{
		driver  = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(Uname);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();

}
	
	@AfterMethod
	
	public void closeBrowser()
	{
		driver.close();
	}
}

