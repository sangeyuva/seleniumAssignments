package week5.day1.TestnG;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SampleCode {
	

		public  EdgeDriver	driver;
		@Test
		 public void loginPage() {
			 
			 	 driver = new EdgeDriver();
				 driver.manage().window().maximize();
				 driver.get("http://leaftaps.com/opentaps/control/main");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				 
				 
			  
		       }  
	}

