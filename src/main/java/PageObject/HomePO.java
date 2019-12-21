package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePO {

	WebDriver driver;

	@FindBy(xpath = "")
	WebElement productSearch;

	@FindBy(xpath = "")
	WebElement createAssort;

	@FindBy(xpath = "")
	WebElement creatOrder;

	public void clickproductSearch() {

		productSearch.click();
	}
}
