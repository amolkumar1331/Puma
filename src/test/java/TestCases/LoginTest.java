package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.ExcelReadandWrite;
import Base.baseClass;
import PageObject.LoginPO;

@Listeners(iTest.listener.class)
public class LoginTest extends baseClass {

	@Test(dataProvider = "testdata")
	public void signin(String uname, String pass) {

		LoginPO lp = PageFactory.initElements(driver, LoginPO.class);
		lp.signIn(uname, pass);
	}

	@DataProvider(name = "testdata")
	public Object[][] datap() throws IOException {

		ExcelReadandWrite e = new ExcelReadandWrite("Data");

		Object[][] obj = ExcelReadandWrite.readData();
		return obj;

	}

}
