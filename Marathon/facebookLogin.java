package Marathon;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class facebookLogin {
	private static HashMap<String, String> readGmail1;

	public static void main(String[] args) throws IOException, GeneralSecurityException {
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--disable-notifications--");
					ChromeDriver driver = new ChromeDriver(options);
					driver.manage().window().maximize();
					driver.navigate().to("http://www.facebook.com");
					String currentUrl = driver.getCurrentUrl();
					System.out.println(currentUrl);
					assertEquals(currentUrl, "http://www.facebook1.com");
					driver.findElement(By.id("u_0_0_5O")).click();
					driver.findElement(By.name("firstname")).sendKeys("Test");
					driver.findElement(By.name("lastname")).sendKeys("User");
					driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
					driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testuser@test.com");
					driver.findElement(By.name("reg_passwd__")).sendKeys("testPassword");
					WebElement day = driver.findElement(By.id("day"));
					WebElement month =driver.findElement(By.id("month"));
					WebElement year =(driver.findElement(By.id("year")));
					Select options1 = new Select(day);
					options1.selectByValue("6");
					Select options2 = new Select(month);
					options2.selectByValue("Jun");
					Select options3 = new Select(month);
					options3.selectByValue("1988");
					driver.findElement(By.xpath("//label[text()='Female']")).click();
					driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
//					readGmail1 = GMail.readGmail();
//					System.out.println(readGmail1);
//					String code = readGmail1.get(readGmail1);
//					System.out.println(code);
					
					
					
					
					
					
					
					
					

}
}
