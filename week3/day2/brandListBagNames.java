package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brandListBagNames {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		WebElement count = driver.findElement(By.xpath("//div[@class='length']"));
		String ss = count.getText();
	
		System.out.println("Count of fetched product : " + ss);
		driver.findElement(By.xpath("(//div[@class='facet-head '])[2]")).click();
		driver.findElement(By.xpath("(//div[@id='verticalsizegroupformat'])[2]")).click();
		List<WebElement> brands = driver.findElements(By.xpath("//span[@class='facet-list-title-name']"));
		List<String> brandList = new ArrayList<>();
		
		for (WebElement bds : brands) {
			String bName = bds.getText();
			brandList.add(bName);

		}
System.out.println("Count of brand name with Duplicates  "  +brandList.size());

		System.out.println("With duplicates  : " +brandList);
		Set <String> nDupBrandList = new LinkedHashSet<>(brandList);
		System.out.println("Count of brand name without Duplicates  " + nDupBrandList.size());
		System.out.println("Without Duplicates : "  +nDupBrandList);
		
		if(nDupBrandList==brandList)
		{
			System.out.println("No duplicates");
		}
		else
		{System.out.println("Duplicate are present");
		
		}
		driver.findElement(By.className("ic-close-quickview")).click();
	//	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//	jse.executeScript("window.scrollBy(0,4250)", "");
		List<WebElement> bagNames = driver.findElements(By.xpath(".//div[@class='nameCls']"));
		List<String> nameList = new ArrayList<>();
		for (WebElement nms : bagNames) {
			String bagName = nms.getText();
			nameList.add(bagName);

		}
System.out.println("Count of Bag name   "  +nameList.size());
System.out.println("Names of bag  : " +nameList);


		
		
	}
	
}

//QA:
//Can we sort the List . if yes how to do ??
//how to print the duplicates
//Bag Names in first page alone shown (inner scroll + Pagination ) ---> how to do 

