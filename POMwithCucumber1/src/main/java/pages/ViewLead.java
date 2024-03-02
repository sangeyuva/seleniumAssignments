package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base.baseClass;

public class ViewLead extends baseClass{
	
	public void viewlead() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String hh = text.replaceAll("[\\d,(),\\s]","");
			if(hh.contains("company"))
			{
				System.out.println("Lead Created Successfully");
			}
			else
			{
				System.out.println("Lead is not Created");
			}
					
			
	}
	}


