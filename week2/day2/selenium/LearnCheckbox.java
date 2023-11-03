package week2.day2.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class LearnCheckbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("ui-chkbox-label")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		// index based attribute
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]"))
				.click();

		// driver.findElement(By.xpath("//label[@for=
		// 'j_idt87:basic:1']/parent::td]")).click();
		// driver.findElement(By.xpath("//input[@id='j_idt87:basic:1']/following::div[1]]")).click();
		// attribute xpath
		driver.findElement(By.xpath("//label[@for= 'j_idt87:basic:2']")).click();

//Child to parent
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:1']/parent::td")).click();

//EC to YC 
// TriState Check box handling
		WebElement triState = driver.findElement(By.xpath(
				"//input[@id='j_idt87:ajaxTriState_input']/following::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		boolean stateOne = triState.isEnabled();

		if (stateOne == true) {
			Thread.sleep(5000);
			triState.click();
			Thread.sleep(2000);

			String popup1 = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();

			// Alert alert = driver.switchTo().alert();
//String	kk = alert.getText();
			// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.alertIsPresent());

//	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//	alert.getText();
			System.out.println("Checkbox is selected");

			System.out.println(popup1);
			// System.out.println(kk);

			Thread.sleep(5000);

			triState.click();

			Thread.sleep(2000);
			String popup2 = driver.findElement(By.xpath("//p[text()='State = 2']")).getText();
			System.out.println("Cross Mark selected");

			System.out.println(popup2);

			Thread.sleep(5000);

			triState.click();
			Thread.sleep(2000);
			String popup3 = driver.findElement(By.xpath("//p[text()='State = 0']")).getText();

			System.out.println("Deselected");

			System.out.println(popup3);

		}
// Toggle Switch & popup Handling

		Thread.sleep(5000);

		WebElement toggleSwitch = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		boolean toggleState1 = toggleSwitch.isSelected();

		if (toggleState1 == false) {
			toggleSwitch.click();
			Thread.sleep(3000);
			String popup = driver.findElement(By.xpath("//div[@class='ui-growl ui-widget']")).getText();
			System.out.println(popup);
			toggleSwitch.click();
			Thread.sleep(3000);
			popup = driver.findElement(By.xpath("//div[@class='ui-growl ui-widget']")).getText();
			System.out.println(popup);
		}

		else {
			toggleSwitch.click();
			Thread.sleep(3000);
			String popup = driver.findElement(By.xpath("//div[@class='ui-growl ui-widget']")).getText();
			System.out.println(popup);

		}

// Disabled Check box Handling
		WebElement disableCheckBox = driver.findElement(By.xpath(
				"//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']"));
//boolean status = disableCheckBox.isEnabled();

		String cl = disableCheckBox.getAttribute("class");
		boolean status = cl.contains("disabled");

		System.out.println(status);
		if (status = true) {
			System.out.println("Check box is Disabled");
		} else {
			System.out.println("Checkbox is  enabled");

		}

		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]/preceding-sibling::div")).click();
		WebElement istan1 = driver
				.findElement(By.xpath("(//label[text()='Istanbul'])[2]/preceding-sibling::div/div[2]"));
		istan1.click();
		WebElement mm = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']"));
		mm.click();

//YS to ELder Sibling
		driver.findElement(By.xpath("//span[text()='Istanbul']/preceding-sibling::span")).click();
		mm.click();

		boolean Ucheck = istan1.isSelected();
		System.out.println(Ucheck);
		mm.click();
		istan1.click();
		//WebElement istan = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-focus ui-state-active']/span[@class='ui-chkbox-icon ui-icon ui-icon-check']"));
		boolean Ucheck1 = istan1
				.isSelected();
//System.out.println(Ucheck1);
//System.out.println("All good");
		String cl1 = istan1.getAttribute("class");
		boolean status1 = cl1.contains("active");

		if (status1 == true) {
		System.out.println("reselected");
	} else {
		System.out.println("failed");
	}

	}

}
