package Com.NopCommerce.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.NopCommerce.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void TC_LoginTest_001()
	{
		
		Logger.info("Login Page is open");
		LoginPage lp = new LoginPage(driver);
		lp.ClickLoginOption();
		
		lp.GetEmail(rc.GetUserName());
	    lp.GetPassword(rc.GetUserPassword());
		lp.ClickLogin();
		Logger.info("Customer Login Sucessfully");
		
		
		if(driver.getTitle().equals("nopCommerce demo store"))
		{
			Assert.assertTrue(true);
			Logger.info("TestCase is Passed");
		   
		   
		}
		else
		{
			Assert.assertTrue(false);
			Logger.info("TestCase is Failed");
		}
	}
	
	

}
