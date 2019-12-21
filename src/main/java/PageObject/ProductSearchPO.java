package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSearchPO {

	WebDriver driver;

	@FindBy(xpath = "")
	WebElement searchBar;

	@FindBy(xpath = "")
	WebElement searchbtn;

	public void search(String txt) {
		searchBar.clear();
		searchBar.sendKeys(txt);
		searchbtn.click();
	}

}
