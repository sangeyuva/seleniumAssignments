package Marathon;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		// ChromeDriver driver = new ChromeDriver(); >> if using chrome options, we need
		// to pass the arguments
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement m1 = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(m1).perform();
		// to freeze dom : setTimeout(function(){debugger;},10000);
		// when we are able to inspect, its not alert, we can handle normally or using
		// chrome options

		WebElement m2 = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		builder.moveToElement(m2).perform();
		driver.findElement(By.xpath("//div[@class='DesktopHeader__featureBrands']/div[2]")).click();
		WebElement d1 = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		d1.click();
		Select options1 = new Select(d1);
		options1.selectByVisibleText("New Arrivals");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Men']")).click();

		Thread.sleep(6000);
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'priceHolder')]/h3"));

		List<String> p1 = new ArrayList<String>();

		for (WebElement amt : price) {
			String rate = amt.getText();
			p1.add(rate);

		}
		System.out.println(p1);
		System.out.println(p1.size());
//	Collections.replaceAll(null, null, null)
		System.out.println(p1);
		// Socket Exception
//				Step 1 :- Go to Window --> Preferences
//				Step 2 :- Under Java --> Click Installed JREs & Click Add Tab.
//				Step 3 :- Select Standard VM --> Select Next
//				Step 4 :- Add the Jdk path(from ur local system where you have installed java) in JRE home text box.
//				Step 5 :- Then Click Finish.
//				Step 6 :- Now u see your Jdk path is added.
//				Step 7 :- Now Click ur CheckBox of ur Jdk path and Click Apply & Close Button.
//				Wait for the building of Project to complete and then Execute your Code.

		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wh = new ArrayList<String>(windowHandles);
		driver.switchTo().window(wh.get(1));

		String text = driver.findElement(By.className("ProductDetailsMainCard__price")).getText();
		String mk = text.replaceAll("[[A-Z],:,\\s,\\?]","");
		System.out.println(mk);

		//Collections.replaceAll(p1, "?", "");
		System.out.println(p1.get(0));
		if (p1.get(0).equalsIgnoreCase(mk)) {
			System.out.println("Price is Correct");
		}

		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		Thread.sleep(3000);
		String text2 = driver.findElement(By.className("DesktopHeader__cartCount")).getText();
		System.out.println(text2);
		driver.findElement(By.className("DesktopHeader__cartCount")).click();
		Thread.sleep(5000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./ScreenShot_Amazon/marathon21.png");
		FileUtils.copyFile(source, target);
		driver.close();
		driver.switchTo().window(wh.get(0));

		driver.close();

	}
}
