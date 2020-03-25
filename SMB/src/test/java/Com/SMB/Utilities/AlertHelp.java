package Com.SMB.Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SMB.Base.TestBase;

public class AlertHelp extends TestBase {
	
	@Test(dataProviderClass=TestUtill.class,dataProvider = "dp")
	public static void ForAlert(String alertTextDisplayed) {
	
	
	
	
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	Assert.assertTrue(alert.getText().contains(alertTextDisplayed));

	alert.accept();

}
}