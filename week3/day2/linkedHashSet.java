package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedHashSet {

	public static void main(String[] args) {
		String ss = null;

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus", Keys.ENTER);
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));

		Set<String> nDuplicate = new LinkedHashSet<>();

		for (WebElement each1 : price) {

			ss = each1.getText();
			nDuplicate.add(ss);
			System.out.println("The Price is  " +ss);
			System.out.println(ss.length());
		}
		System.out.println(ss.length());
		System.out.println(nDuplicate.size());

		System.out.println(nDuplicate);

		
	}
}
