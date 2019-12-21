package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO {

	WebDriver driver;

	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "txtUserName")
	WebElement username;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "LinkButton1")
	WebElement submit;

	public void signIn(String uname, String pass) {
		username.clear();
		username.sendKeys(uname);

		password.clear();
		password.sendKeys(pass);

		submit.click();
	}

}
