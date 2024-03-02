package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.baseClass;
import steps.BaseClass;

public class ViewLead extends BaseClass {

	public ViewLead(ChromeDriver driver) {
		this.driver = driver;
	}

	public void viewlead() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String hh = text.replaceAll("[\\d,(),\\s]", "");
		if (hh.contains("company")) {
			System.out.println("Lead Created Successfully");
		} else {
			System.out.println("Lead is not Created");
		}

	}
}
