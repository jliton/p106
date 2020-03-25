package Com.SMB.Rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProperties {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		String ScreenShotNmae=new Date().toString().replace(".", "_").replace(" ", "_") + ".jpg";
		System.out.println(ScreenShotNmae);
			
		}
	}
	
	

