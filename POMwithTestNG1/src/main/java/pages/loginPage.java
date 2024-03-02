package pages;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.baseClass;

public class loginPage extends baseClass{
	
	public loginPage(ChromeDriver driver)
    {
        this.driver = driver;
    }
	

	

	public loginPage userName(String Uname)
	{
		System.out.println("driver:" + driver);
		driver.findElement(By.id("username")).sendKeys(Uname);
return this;
	}
	
	
	public loginPage password(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
return this;
}
	public WelcomeHomePage ClickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomeHomePage(driver);

	}
}
