package Com.SMB.Listners;

import java.io.IOException;
import java.util.Date;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import Com.SMB.Base.TestBase;
import Com.SMB.Utilities.TestUtill;

public class CustomListners extends TestBase implements  ITestListener{
public String screenshotName;
	public void onTestStart(ITestResult result) {
		test= repo.startTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult res) {
		System.setProperty("org.uncommons.reportng.escape-output","false");
		try {
			screenshotName = res.getMethod().getMethodName()+".jpg";
			TestUtill.captureScreenshot(screenshotName);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		test.log(LogStatus.PASS,"");
//		repo.endTest(test);
//		repo.flush();	
	}

	
	public void onTestFailure(ITestResult res) {
		// TODO Auto-generated method stub
		System.setProperty("org.uncommons.reportng.escape-output","false");
		try {
			screenshotName = res.getMethod().getMethodName()+".jpg";
			TestUtill.captureScreenshot(screenshotName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		test.log(LogStatus.PASS,"");
		repo.endTest(test);
		repo.flush();
		
	}

	
	

}
