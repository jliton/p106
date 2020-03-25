package market;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class a {

	static WebDriver driver;

	 static String N="http://192.168.1.230:4444/wd/hub";
	
	 @Parameters("Browser")
	 @Test	
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
	         driver=new RemoteWebDriver(new URL(N),caps);
			driver.get("https://wiautomation.com/select-your-location.html");
			driver.manage().window().maximize();
			//driver.quit();
			
		}

}
