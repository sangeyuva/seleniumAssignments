package Marathon;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class navigateCommands {	

	public static void main(String[] args) {
	FirefoxOptions options = new FirefoxOptions();		
	options.addArguments("--disable-notifications--");
				FirefoxDriver driver = new FirefoxDriver(options);
				driver.manage().window().maximize();
				driver.navigate().to("http://qatechhub.com");
			String	title = driver.getTitle();
			assertEquals(title, "QA Automation Tools Trainings and Tutorials | QA Tech Hub");
			driver.navigate().to("https://www.facebook.com");
			driver.navigate().back();
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			driver.navigate().forward();
			driver.navigate().refresh();
			String currentUrl2 = driver.getCurrentUrl();
			System.out.println(currentUrl2);
			
			driver.close();
			
				
	}

}
