package Com.SMB.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.SMB.Base.TestBase;

public class Server_Hub extends TestBase{
	static WebDriver driver;


	 public static void GridHelpTest(String Browser) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + 
				"\\src\\test\\Executeable\\chromedriver.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "8.1");
		caps.setCapability("browser", Browser);
		caps.setCapability("browser_version", "80.0.3987.149");	   	
       ChromeOptions op=new ChromeOptions();
       
		caps.merge(op);
	         driver=new RemoteWebDriver(new URL(OR.getProperty("Server_Hub")),caps);
}
}