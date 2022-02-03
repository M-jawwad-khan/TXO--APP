package Automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, HomePage.this);
	}

}

driver.findElement(By.xpath("//td[text()='"+VendorName+"']")).sendKeys(VendorName); 