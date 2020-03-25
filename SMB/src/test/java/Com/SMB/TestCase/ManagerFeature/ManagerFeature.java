package Com.SMB.TestCase.ManagerFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SMB.Base.TestBase;
import Com.SMB.POM.ForAssertionTest;
import Com.SMB.POM.ForClick;
import backupbase.TestBase_g;

public class ManagerFeature extends TestBase{
	
	@Test
	public  void LaunchingUrl() {
		
		log.debug("ManagerLogin TC executing...");
		
		
		ForClick.ClickOn("Manager_Login_Button");
     	log.debug("Clicked on manager login button");
		log.debug("Manager log in TC executed successfully....");
		ForAssertionTest.ForAssertion("addCustBtn_xpath", "addCustBtn_xpath");
		
	}

}
