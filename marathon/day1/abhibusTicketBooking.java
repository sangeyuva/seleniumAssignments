
package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class abhibusTicketBooking {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).click();
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		driver.findElement(By.xpath("//span[text()='2']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		String busName = driver.findElement(By.xpath("(//div[@class='operator-info col-xl-5'])[1]")).getText();
		System.out.println("Bus Name " + busName);
		driver.findElement(By.xpath("//span[text()='Sleeper']/parent::a")).click();
		String seatCount = driver.findElement(By.xpath("(//div[@class='text-grey']/small)[1]")).getText();
		System.out.println("Seat Count " + seatCount);
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		driver.findElement(By.xpath("(//button[@class='seat sleeper'])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'container checkbox-container')])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
		String seatSelected = driver.findElement(By.xpath("//span[text()='Seat Selected :']/span")).getText();
		System.out.println("Selected Seat  " + seatSelected);
		String busFare = driver.findElement(By.xpath("//span[text()='Base Fare :']/span")).getText();
		System.out.println("Bus Fare  " + busFare);
		String title = driver.getTitle();
		System.out.println(title);

	}
}