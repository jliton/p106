package Com.SMB.POM;

import org.openqa.selenium.By;
import org.testng.Assert;

import Com.SMB.Base.TestBase;

public class ForAssertionTest  extends TestBase{
	public static void ForAssertion(String input, String input1) {

		Assert.assertEquals(driver.findElement(By.xpath(OR.getProperty(input))), driver.findElement(By.xpath(OR.getProperty(input1))));

	}
//
public static boolean ifItDisplayed(String locator) {
	
	if(driver.findElement(By.xpath(OR.getProperty(locator))).isDisplayed());
	return true
			;
	
	
}

}