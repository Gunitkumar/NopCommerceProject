package Com.NopCommerce.TestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Com.NopCommerce.Utilities.ExtenreportNG;

public class Listeners extends BaseClass implements ITestListener {
	ExtentReports extent = ExtenreportNG.getReportObject();
	public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
	test = 	extent.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	test.fail(result.getThrowable());
	//test.addScreenCaptureFromPath(null)
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		;
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
