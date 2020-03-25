package Com.SMB.TestCase.ManagerFeature;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Com.SMB.Base.TestBase2;
import Com.SMB.POM.ForAssertionTest;
import Com.SMB.POM.ForClick;
import Com.SMB.POM.ForEditBox;
import Com.SMB.Utilities.AlertHelp;
import Com.SMB.Utilities.TestUtill;

public class AddingNewCustomerTest extends TestBase2 {

	@Test(dataProviderClass = TestUtill.class, dataProvider = "dp", priority = 1)

	public void AddCustomerTest(String firstName, String lastName, String postCode, String alertTextDisplayed)
			throws InterruptedException {

		if (ForAssertionTest.ifItDisplayed("Manager_Login_Button")) {

			ForClick.ClickOn("Manager_Login_Button");

		} else {

			log.debug("Running TC after depended TC");
		}
		
		
		
	
		ForClick.ClickOn("addCustBtn_xpath");
		ForEditBox.Writre_inEditBox("firstname_xpath", firstName);
		ForEditBox.Writre_inEditBox("lastname_xpath", lastName);
		ForEditBox.Writre_inEditBox("postcode_xpath", postCode);
		ForClick.ClickOn("addCustomer");
		AlertHelp.ForAlert(alertTextDisplayed);
		//test.log(LogStatus.INFO, "Added customer succesfully....");

	}

}
