package Com.SMB.POM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.SMB.Base.TestBase;
import Com.SMB.Utilities.TestUtill;

public class ForEditBox extends TestBase{

	@Test(dataProviderClass=TestUtill.class, dataProvider = "dp")
	public static void Writre_inEditBox(String input, String TextInput) {

		driver.findElement(By.xpath(OR.getProperty(input))).sendKeys(TextInput);

	}
	
	
	
}
