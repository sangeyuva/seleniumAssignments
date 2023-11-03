package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class pvrCinemasBooking {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("//span[text()='Genre']")).click();
	//	driver.findElement(By.xpath("//li[@aria-label='ACTION']")).click();
	//	driver.findElement(By.xpath("//span[text()='Language']")).click();
	//	driver.findElement(By.xpath("//span[text()='TAMIL']/parent::li")).click();
	//	WebElement mainElement = driver.findElement(By.xpath("(//div[@class='movie-box'])[1]"));
	//	WebElement secondElement = driver.findElement(By.xpath("(//a[text()='Book Tickets'])[1]"));
	//	secondElement.click();

	//	Actions action = new Actions(driver);
		//action.moveToElement(mainElement).perform();
	//	action.moveToElement(secondElement).click().build().perform();;
		
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(2000)		;
	WebElement place =driver.findElement(By.name("city"));
	Select spot = new Select(place);
	spot.selectByValue("Chennai");
	WebElement genre1 =driver.findElement(By.name("genre"));
	Select genre2 = new Select(genre1);
	genre2.selectByIndex(3);
	WebElement lang = driver.findElement(By.name("lang"));
	Select lan = new Select(lang);
	lan.selectByVisibleText("HINDI");
	driver.findElement(By.xpath("//button[text()='Apply']")).click();
	Thread.sleep(3000);
WebElement mName = driver.findElement(By.xpath("(//div[@class='movie-list']//img)[1]"));
driver.executeScript("arguments[0].click();",mName);
//	driver.findElement(By.xpath("//div[text()='(2d) The Croods: A New Age (Hindi)']")).click();

	driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
WebElement cName = 	driver.findElement(By.name("cinemaName"));
Select cineName = new Select(cName);
cineName.selectByValue("PVR Theyagaraja Thiruvanmiyur Chennai");
WebElement timing =driver.findElement(By.name("timings"));
Select tmg = new Select(timing);
tmg.selectByVisibleText("12:00 PM - 03:00 PM");
driver.findElement(By.name("name")).sendKeys("Sangeetha");
driver.findElement(By.name("mobile")).sendKeys("1234567890");
driver.findElement(By.name("comment")).sendKeys("1234567890");
WebElement ppup1= driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']/input"));
driver.executeScript("arguments[0].click()", ppup1);
driver.findElement(By.xpath("//span[text()='9']")).click();
driver.findElement(By.name("noOfTickets")).sendKeys("2");
driver.findElement(By.name("email")).sendKeys("dd@gmail.com");
WebElement foodReq = driver.findElement(By.name("food"));
Select food = new Select(foodReq);
food.selectByIndex(0);
driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
WebElement ppup = driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]"));
driver.executeScript("arguments[0].click()", ppup);
driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
String tt = driver.getTitle();
System.out.println(tt);



		





	
	
	
	
		
		

	}
}
