package week3.day2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.ArrayStack;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsList {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus", Keys.ENTER);
		// List<WebElement> Name = driver.findElements(By.className("a-size-medium
		// a-color-base a-text-normal"));
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		// for (WebElement each : Name) {
		// String N = each.getText();
		List<String> oneplusList = new ArrayList<>();

		for (WebElement each1 : price) {

			String ss = each1.getText();
			 System.out.println("The Price is "+ss);
			// System.out.println(ss);
					oneplusList.add(ss);
			
		}

		Collections.sort(oneplusList);
		System.out.println(oneplusList);
		

	}

}
