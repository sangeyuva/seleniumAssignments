package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hashSet {
	public static void main(String[] args) {	
		String ss;
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus", Keys.ENTER);
				List<WebElement> price = driver.findElements(By.className("a-price-whole"));
				List <String> outputList = new ArrayList<>();
	
					
						
					for (WebElement each1 : price) {

					 ss = each1.getText();
						 outputList.add(ss);
					}
					
					System.out.println(outputList.size());
					
					
					System.out.println(outputList);
					Set <String> nDuplicate = new HashSet<>(outputList);
System.out.println(nDuplicate.size());
					
					
					System.out.println(nDuplicate);
					
					if(nDuplicate.size()==outputList.size())
					{
						System.out.println("No duplicates");
					}
					else
					{System.out.println("Duplicate are present");
					
					}
			
		

	
		
		
		

	}

}





