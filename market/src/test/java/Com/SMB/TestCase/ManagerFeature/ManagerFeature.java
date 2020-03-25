package Com.SMB.TestCase.ManagerFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SMB.Base.TestBase2;
import Com.SMB.POM.ForAssertionTest;
import Com.SMB.POM.ForClick;

public class ManagerFeature extends TestBase2{
	
	@Test(priority=0)
	public  void LaunchingUrl() {
		
		log.debug("ManagerLogin TC executing...");
		ForClick.ClickOn("Manager_Login_Button");
     log.debug("Clicked on manager login button");
		log.debug("Manager log in TC executed successfully....");
		ForAssertionTest.ForAssertion("addCustBtn_xpath", "addCustBtn_xpath");
		
	}

}
