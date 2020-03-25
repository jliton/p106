package Com.SMB.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.LogStatus;

import Com.SMB.Base.TestBase2;


public class ForClick extends TestBase2 {
	
	
	public static void ClickOn(String Locator) {

		
		
		
		driver.findElement(By.xpath(OR.getProperty(Locator))).click();
		

	}
	
	
}
