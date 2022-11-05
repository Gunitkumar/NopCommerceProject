package Com.NopCommerce.TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.NopCommerce.PageObject.CustRgister;

public class Tc_CustReg_001 extends BaseClass{
	
	@Test
	public void RegisterCust() throws InterruptedException 
	{
		
		
		CustRgister cr = new CustRgister(driver);
		Logger.info("Regisration is Started");
		cr.SelectRegister();
		cr.ClickMale();
		cr.GetFname("Gunit");
		cr.GetLname("Tanna");
		cr.GetDate();
		cr.GetMonth();
		cr.GetYear();
		String email = RandomString()+"@gmail.com";
	    cr.GetEmail(rc.GetUserName());	
	    System.out.println(email);
		Thread.sleep(2000);
		cr.GetCompanyName("testest");
		cr.GetPassword("Gunit@123");
		cr.GetConfPassword("Gunit@123");
		cr.ClickReg();
	
		Logger.info("Customer Register Sucessfully");
    
		
		Logger.info("Validattion is Started");
	boolean result = 	driver.getPageSource().contains("nopCommerce demo store. Register");
		
		 if(result==true)
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
