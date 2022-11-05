package Com.NopCommerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage (WebDriver rdriver)
	{
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[@class='ico-login']")
	@CacheLookup
	WebElement ClickLogin;
	
	
	
	@FindBy(id = "Email")
	@CacheLookup
	WebElement EnterEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement EnterPassword;
	
	@FindBy(xpath = "//button[normalize-space()='Log in']")
	@CacheLookup
	WebElement ClickLoginBtn;
	
	
	public void ClickLoginOption()
	{
		ClickLogin.click();
	}
	
	public void GetEmail(String email)
	{
		EnterEmail.sendKeys(email);
	}
	
	public void GetPassword(String Pass)
	{
		EnterPassword.sendKeys(Pass);
	}
	
	public void ClickLogin()
	{
		ClickLoginBtn.click();
	}

}
