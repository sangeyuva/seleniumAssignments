package pages;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.baseClass;
import steps.BaseClass;

public class loginPage extends BaseClass{
	
	public loginPage(ChromeDriver driver)
    {
        this.driver = driver;
    }
	

	

	public loginPage userName()
	{
		System.out.println("driver:" + driver);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
return this;
	}
	
	
	public loginPage password()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
return this;
}
	public WelcomeHomePage ClickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomeHomePage(driver);

	}
}
