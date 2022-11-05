package Com.NopCommerce.Utilities;

import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting implements ITestListener  {
	public ExtentSparkReporter reporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void Getreport()
	{
	   String path = 	System.getProperty("user.dir")+"//reports//index.html";
	   reporter = new ExtentSparkReporter(path);
	   reporter.config().setDocumentTitle("Test Results");
	   reporter.config().setReportName("Automation results");
	   extent = new ExtentReports();
	   extent.attachReporter(reporter);
	   extent.setSystemInfo("Tester", "Gunit");
	   reporter.config().setTheme(Theme.DARK);
	   extent.flush();
	}

}
	
	
	


