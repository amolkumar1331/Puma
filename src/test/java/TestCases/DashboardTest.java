package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.baseClass;
import PageObject.DashboardPO;

public class DashboardTest extends baseClass {

	@Test
	public void m1() {

		DashboardPO dp = PageFactory.initElements(driver, DashboardPO.class);

		dp.clickvisualAssort();

	}

}
