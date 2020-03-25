package Com.SMB.Utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportManager {
	
	public static ExtentReports extent;
	  public static ExtentReports GetIns() {
		
		  extent =new ExtentReports(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\Extend.html");
		  
		  
		  
		  return extent;
		  
		  
		  
		  
		  
	  }
	

}
