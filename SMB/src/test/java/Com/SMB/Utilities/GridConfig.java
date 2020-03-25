package Com.SMB.Utilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mysql.cj.mysqlx.protobuf.MysqlxConnection.Capabilities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy;

public class GridConfig {
	
	
	
@SuppressWarnings("deprecation")
@Test
	public void DisreCap() throws MalformedURLException {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\src\\test\\resources\\Executeable\\chromedriver.exe");
	ChromeOptions op = new ChromeOptions();
	DesiredCapabilities cap=new DesiredCapabilities(op);
    cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	

	WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/"), op);
	driver.get("https://www.google.com/");
	

		

	
}
}