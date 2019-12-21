package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fp;

	@BeforeSuite
	public void openBrowser() throws IOException {
		fp = new FileInputStream("F:\\Workspace\\amol_workspace\\com.puma\\src\\main\\resources\\config.properties");
		prop = new Properties();
		prop.load(fp);

		if (prop.getProperty("Browser").equals("Chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (prop.getProperty("Browser").equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else
			System.out.println("Browser not found");

		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	/*
	 * @Test(priority = 2) public void verifyTitle() {
	 * 
	 * String url = driver.getCurrentUrl(); Assert.assertEquals(url,
	 * "https://www.olacabs.com/"); }
	 */

	public static void takeSS(String pathname) throws IOException {

		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File(pathname));

	}
	
	
	
}
