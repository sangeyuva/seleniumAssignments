package Marathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v115.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.sukgu.Shadow;

public class serviceNow {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		// ChromeDriver driver = new ChromeDriver(); >> if using chrome options, we need
		// to pass the arguments
		driver.get("https://dev148908.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("en7BCyr1@QG-");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow obj = new Shadow(driver);
		obj.setImplicitWait(20);
		obj.findElementByXPath("//div[text()='All']").click();
		obj.setImplicitWait(20);
		obj.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement f1 = obj.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("//h2[contains(text(),'Hardware')]")).click();
		driver.findElement(By.xpath("//a[@class='service_catalog']//strong[contains(text(),'Apple MacBook Pro 15')]"))
				.click();
		driver.findElement(By.xpath("//button[@id='oi_add_to_cart_button']")).click();
		String subTotal = driver.findElement(By.xpath("//tr[@class='sc_cart_subtotal']/td[2]/strong")).getText();
		System.out.println(subTotal);

		WebElement element = driver.findElement(By.xpath("//button[@id='catalog_cart_proceed_checkout']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
		element.click();

		String ReqNum = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		System.out.println(ReqNum);
		String total = driver.findElement(By.className("checkoutTotalSum")).getText();
		System.out.println(total);
		Assert.assertEquals(total, subTotal);
		System.out.println("Prices are same");

	}
}