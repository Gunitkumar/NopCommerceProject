package Com.NopCommerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.NopCommerce.TestCases.BaseClass;

public class PlaceOrder {
	WebDriver ldriver;
	
	public PlaceOrder(WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//div[@class='item-grid']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]")
	@CacheLookup
	WebElement ClickOnAppleImg;
	
	@FindBy(xpath ="//button[@id='add-to-cart-button-4']")
	@CacheLookup
	WebElement ClickOnAppleAddtoCart;
	
	//button[@id='add-to-cart-button-4']
	@FindBy(xpath = "//a[normalize-space()='shopping cart']")
	@CacheLookup
	WebElement ClickShoppingCart;
	
	
	@FindBy(name = "termsofservice")
	@CacheLookup
	WebElement SelectAgreeTerm;
	
	@FindBy(name = "checkout")
	@CacheLookup
	WebElement Checkout;
	
	
	@FindBy(xpath = "//option[@value='133']")
	@CacheLookup
	WebElement Country;
	

	@FindBy(xpath = "//option[normalize-space()='Other']]")
	@CacheLookup
	WebElement SelectState;
	

	@FindBy(name = "BillingNewAddress.City")
	@CacheLookup
	WebElement City;
	
	@FindBy(name = "BillingNewAddress.Address1")
	@CacheLookup
	WebElement Address1;
	
	@FindBy(name = "BillingNewAddress.ZipPostalCode")
	@CacheLookup
	WebElement Pincode;
	
	@FindBy(name = "BillingNewAddress.PhoneNumber")
	@CacheLookup
	WebElement Mobile;

	@FindBy(xpath = "//button[@onclick='Billing.save()']")
	@CacheLookup
	WebElement Continue;
	
	@FindBy(xpath = "//input[@id='shippingoption_1']")
	@CacheLookup
	WebElement ShippingMthd;
	
	
	@FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
	@CacheLookup
	WebElement PayMethod;
	
	@FindBy(id = "paymentmethod_0")
	@CacheLookup
	WebElement PayMethod2;
	

	@FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
	@CacheLookup
	WebElement PayContinue;
	
	
	@FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
	@CacheLookup
	WebElement PaymentInfo;
	
	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	@CacheLookup
	WebElement OrderConfirm;
	
	
	@FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
	@CacheLookup
	WebElement OrderPlaced;
	
	
	
	public void ClickAddToCartOption ()
	{	
		ClickOnAppleImg.click();
		
	}
	
	public void AddToCart()
	{
		ClickOnAppleAddtoCart.click();
	}
	
	public void ShoppingCart()
	{
		ClickShoppingCart.click();
	}
	
	
	public void AgreeCondition()
	{
		SelectAgreeTerm.click();
	}
	
	public void ClickCheckout()
	{
		Checkout.click();
	}
	
	public void SelectCountry()
	{
		Country.click();
	}
	
	public void SelectCity(String citi)
	{
		City.sendKeys(citi);;
	}
	
	public void EnterAddress1(String Address)
	{
		Address1.sendKeys(Address);
	}
	
	public void EnterPincode(String Pincodee)
	{
		Pincode.sendKeys(Pincodee);
	}
	
	public void EnterMobile(String Mob)
	{
		Mobile.sendKeys(Mob);
	}
	
	public void ClickOnContinue()
	{
		Continue.click();
	}
	
	public void SelectShippingMthd()
	{
		ShippingMthd.click();
	}
	
	public void SelectPayMethod()
	{
		PayMethod.click();
	}
	
	public void SelectPayMethod2()
	{
		PayMethod2.click();
	}
	
	public void SelectPayContinue()
	{
		PayContinue.click();
	}
	
	public void ClickPaymentInfo()
	{
		PaymentInfo.click();
	}
	
	
	public void ClickOrderConfirm()
	{
		OrderConfirm.click();
	}
	
	public void OrderPlaced()
	{
		OrderPlaced.getText();
	}
	
	

}
