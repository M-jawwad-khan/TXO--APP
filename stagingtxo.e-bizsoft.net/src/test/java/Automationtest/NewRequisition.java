package Automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewRequisition {

	WebDriver driver;
	public NewRequisition(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, NewRequisition.this);
	}
	Actions actions = new Actions(driver);
	
	
	@FindBy(xpath = "//span[@class = 'prefix lefields-big  class-autocomplete-vendor  search' and @data-hasqtip = '18']") 
	WebElement ClickOnVendorIcon; 

	  

	@FindBy(xpath = "//input[@id = 'filterVendor' and @class='filterInput']") 
	WebElement SearchVendorByName; 

	@FindBy(id = "cboShipVia") 
	WebElement DDSelectShipVia; 

	@FindBy(id ="ddlShipToType") 
	WebElement DDShipType; 

	@FindBy(xpath = "//span[@class = 'prefix lefields-big  class-autocomplete-header-customer  search' and @data-hasqtip ='49']") 
	WebElement ClickOnCustomerIcon; 

	@FindBy(id = "filterShipToType") 
	WebElement SearchCus; 
	
	@FindBy(id = "txtMemo") 
	WebElement txtMemo; 

	@FindBy(id = "txtMesgToVen") 
	WebElement TxtNotes; 

	@FindBy(id = "ddlPriority") 
	WebElement DDpriority; 

	@FindBy(xpath = "//input[@id = 'Text23']") 
	WebElement SelectPromiseDate; 

	@FindBy(xpath = "//div[@class = 'test']//span[@class = 'prefix class-autocomplete-item lefields-big search']") 
	WebElement SearchItem; 
	
	@FindBy(xpath ="//span[@class = 'ui-datepicker-month']")
	WebElement getMonth;
	
	@FindBy(xpath = "//span[@class = 'ui-datepicker-year']")
	WebElement getYear;
	
	@FindBy(xpath = "//span[text() = 'Next']")
	WebElement NextBtn;
	
	
	public void returnMethod(String )

	public void SelectYourPromiseDate(String Month, String year, String Date){ 

		//a[text() = '16'] //span[text() = 'Next']
		
		WebElement getMonth = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']"));
		
		while(Month == getMonth ) {
			
		}
		
		
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}

	}
	//if(

	//td[@data-month='9' and @data-year='2021']//a[text()='8'] 

	//Date select with month while loop) 

//	} 

	  
	public void SelectVendor(String VendorName){ 
		SearchVendorByName.sendKeys(VendorName); 
		WebElement doubleclick =driver.findElement(By.xpath("//td[text()='"+VendorName+"']"));
		actions.doubleClick(doubleclick).perform();
		} 
	
	public void SelectCustomer(String CustomerName){ 

	SearchCus.sendKeys(CustomerName); 
	WebElement doubleclick =driver.findElement(By.xpath("//td[text()='"+CustomerName+"']"));
	actions.doubleClick(doubleclick).perform();
	} 

	@FindBy(xpath ="")
	WebElement AddToReq;
	public void selectItem(String ItemName){ 
		
		String[] EachItem = ItemName.split(" ");
		for(int i = 0; i >= EachItem.length; i++) {
		WebElement SearchItemItem = driver.findElement(By.xpath(""));
		SearchItem.sendKeys(EachItem[i]);
		WebElement SelectItem = driver.findElement(By.xpath(""));
		SelectItem.click();
		}
		AddToReq.click();
		

	}
	
	

//	Paragraph wala kaam hoga paragah mai hr individual word niklyn gyn phr jitny word hogy witna loop chalayn gyn 

	  

	} 

	 

