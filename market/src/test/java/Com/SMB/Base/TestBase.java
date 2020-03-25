package Com.SMB.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Com.SMB.POM.ForClick;
import Com.SMB.Utilities.ExcelReader;
import Com.SMB.Utilities.ReportManager;

public class TestBase {

	public static WebDriver driver;
	protected Properties config = new Properties();
	public static Properties OR = new Properties();
	FileInputStream fis;
	public static WebDriverWait wait;
	public ExtentReports repo = ReportManager.GetIns();
	public static ExtentTest test;

	public static Logger log = Logger.getLogger("DevInfo");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\TestData.xlsx");

	@BeforeSuite
	public void setUps() throws IOException {
		if (driver == null) {

			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\Config.properties");
			config.load(fis);
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\OR.properties");
			OR.load(fis);
			log.debug(" confiq and OR properties file  loaded");

		}
//
		if (config.getProperty("browser").equals("chrome")) {
			log.debug("Chrome is launching");

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\Executeable\\chromedriver.exe");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "8.1");
			caps.setCapability("browser", config.getProperty("browser"));
			caps.setCapability("browser_version", "80.0.3987.149");
			ChromeOptions op = new ChromeOptions();
			caps.merge(op);
			driver = new RemoteWebDriver(new URL(config.getProperty("N")), caps);

			driver.get(config.getProperty("SMBURL"));
			log.debug("Web site launched...");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("wait")), TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 5);

		}

	}

	public boolean isElementExist(By by) {

		try {

			driver.findElement(by);
			return true;

		} catch (NoSuchElementException e) {

			return false;

		}

	}

	@AfterSuite
	public void teardown() {
		if (driver != null) {
			// driver.quit();

			log.debug("test execution completed");

		}
	}
}
