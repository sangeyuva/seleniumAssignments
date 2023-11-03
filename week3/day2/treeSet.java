package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class treeSet {
	
	

	//treeset stores values  in sorted order and it doesnt have get method
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus", Keys.ENTER);
				List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		
		List<String> oneplusList = new ArrayList<>(); // Create List

		for (WebElement each1 : price) {

			String ss = each1.getText();
			
					oneplusList.add(ss); // Add values to list
					
		}
		System.out.println(oneplusList.size());
					Set <String> nDuplicate = new TreeSet<>(oneplusList);
					System.out.println(nDuplicate);
					System.out.println(nDuplicate.size());
					if(nDuplicate==oneplusList)
					{
						System.out.println("No duplicates");
					}
					else
					{System.out.println("Duplicate are present");
					
					}
			
		

	
		
		
		

	}

}



