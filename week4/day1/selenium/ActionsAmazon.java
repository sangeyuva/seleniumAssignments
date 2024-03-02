package week4.day1.selenium;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.client.model.ReturnDocument;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String text = driver.findElement(By.className("a-price-whole")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[1]"))
				.click();
		Set<String> windowHandles = driver.getWindowHandles();

		List<String> mm = new ArrayList<String>(windowHandles);
		System.out.println(mm);
		driver.switchTo().window(mm.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		String text2 = driver.findElement(By.xpath("(//span[@class='a-icon-alt'])[1]")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//div[@id='imgTagWrapperId']")).click();
		driver.findElement(By.id("ivImage_1")).click();
		Thread.sleep(4000);
		// WebElement popup = driver.findElement(By.id("zoomWindow"));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./ScreenShot_Amazon/secondimage1.png");
		FileUtils.copyFile(source, target);
		driver.findElement(By.xpath("//button[@data-action='a-popover-close']")).click();
		WebElement element = driver.findElement(By.id("submit.add-to-cart"));
		driver.executeScript("arguments[0].scrollIntoView();", element);
	//	driver.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		Thread.sleep(4000);

		WebElement cartele = driver.findElement(By.xpath("//form[@id='attach-view-cart-button-form']"));

		cartele.click();

		String text3 = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']")).getText();
		System.out.println(text3);
		String ss = text3.replaceAll("[,:,\\s,]", "");
		float j = Float.parseFloat(ss);
		int h = (int) j;
		String ss1 = text.replaceAll("[,:,\\s,]", "");
		float j1 = Float.parseFloat(ss1);
		int h1 = (int) j1;
		if (h == h1) {
			System.out.println("Subtotal is Correct");
		}

	}

}
