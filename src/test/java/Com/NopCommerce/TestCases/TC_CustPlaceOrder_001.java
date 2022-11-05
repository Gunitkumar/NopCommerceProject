package Com.NopCommerce.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.NopCommerce.PageObject.LoginPage;
import Com.NopCommerce.PageObject.PlaceOrder;

public class TC_CustPlaceOrder_001 extends BaseClass{
	@Test
	public void CustomerPlaceorder() throws InterruptedException 
	{
		LoginPage lp= new LoginPage(driver);
		
		
		Logger.info("User Landing on LoginPage");
		lp.ClickLoginOption();
		lp.GetEmail(rc.GetUserName());
		lp.GetPassword(rc.GetUserPassword());
		lp.ClickLogin();
		Logger.info("User Login Sucessfully");
		Thread.sleep(1000);
		PlaceOrder  po = new PlaceOrder (driver);
		
		Thread.sleep(1000);
		Logger.info("Order Placing is Started");
		po.ClickAddToCartOption();
		po.AddToCart();
		po.ShoppingCart();
		po.AgreeCondition();
		po.ClickCheckout();
		po.SelectCountry();
		po.SelectCity("Akola");
		po.EnterAddress1("telhara,hkd");
		po.EnterPincode("444103");
		po.EnterMobile("9960273630");
		po.ClickOnContinue();
		po.SelectShippingMthd();
		po.SelectPayMethod();
		po.SelectPayMethod2();
		po.SelectPayContinue();
		po.ClickPaymentInfo();
		po.ClickOrderConfirm();
	
		boolean result = driver.findElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']")).getText().contains("Your order has been successfully processed!"); 
		
		if(result==true)
		{
			Assert.assertTrue(true);
			Logger.info("TestCase is Passed ");
		}
		else
		{
			Assert.assertTrue(false);
			Logger.info("Testcase is failed");
		}
		
	}

}
