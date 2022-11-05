package Com.NopCommerce.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtenreportNG {
	
	
	

	public static ExtentReports getReportObject()
	{
		//public ExtentSparkReporter reporter;
		//public ExtentReports extent;
		//public ExtentTest test;
	  String path = 	System.getProperty("user.dir")+"//reports/index.html";
	  ExtentSparkReporter   reporter = new ExtentSparkReporter(path);
	  reporter.config().setReportName("Web Automation Results");
	  reporter.config().setDocumentTitle("Test Results");
	  
	  ExtentReports  extent = new ExtentReports();
	  extent.attachReporter(reporter);
	  extent.setSystemInfo("Tester", "Gunit");
	  return extent;
	}
}
