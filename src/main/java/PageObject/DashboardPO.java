package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPO {

	WebDriver driver;
	
	public DashboardPO(WebDriver driver) {
	
	this.driver = driver;
	
	}	
	@FindBy(xpath ="//*[text()=\"Visual Assortment Planning\"]")
	WebElement visualAssort;

	@FindBy(xpath ="//*[text()=\"Early Line Planning\"]")
	WebElement earlyLine;
	

	@FindBy(xpath ="//*[text()=\"Workbook\"]")
	WebElement workbook;
	

	@FindBy(xpath ="//*[text()=\"Planogram\"]")
	WebElement planogram;
	
	
	public void clickvisualAssort() {
	
		visualAssort.click();
	}
	
	
	
}
