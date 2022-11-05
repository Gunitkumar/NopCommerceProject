package Com.NopCommerce.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustRgister {
	
	WebDriver ldriver;
	
	public  CustRgister(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath = "//a[@class='ico-register']")
	@CacheLookup
	WebElement ClickRegister;
	
	@FindBy(id="gender-male")
	@CacheLookup
	WebElement SelectGender;
	
	@FindBy(id = "FirstName")
	@CacheLookup
	WebElement EnterFname;
	
	@FindBy(name= "LastName")
	@CacheLookup
	WebElement EnterLname;
	
	@FindBy(xpath = "//option[normalize-space()='6']")
	@CacheLookup
	WebElement EnterDate;
	
	@FindBy(xpath = "//option[normalize-space()='April']")
	@CacheLookup
	WebElement EnterMonth;
	
	@FindBy(xpath = "//option[@value='1918']")
	@CacheLookup
	WebElement EnterYear;
	
	@FindBy(name = "Email")
	@CacheLookup
	WebElement EnterEmailId;
	
	@FindBy(name= "Company")
	@CacheLookup
	WebElement EnterCName;
	
	@FindBy(name= "Password")
	@CacheLookup
	WebElement EnterPassword;
	
	
	@FindBy(name= "ConfirmPassword")
	@CacheLookup
	WebElement EnterCPassword;
	
	
	@FindBy(name= "register-button")
	@CacheLookup
	WebElement ClickRegisterBtn;
	
	
	
	
	public void SelectRegister()
	{
		ClickRegister.click();
	}
	
	public void ClickMale()
	{
		SelectGender.click();
	}
	
	public void GetFname(String Fname)
	{
		EnterFname.sendKeys(Fname);
	}
	
	public void GetLname(String Lname)
	{
		EnterLname.sendKeys(Lname);
		
	}
	
	public void GetDate()
	{
		EnterDate.click();
	}
	
	public void GetMonth()
	{
		EnterMonth.click();
	}
	
	public void GetYear()
	{
		EnterYear.click();
	}
	
	public void GetEmail(String Email)
	{
		EnterEmailId.sendKeys(Email);
	}
	
	
    public void GetCompanyName(String CName)
     {
    	EnterCName.sendKeys(CName);
     }
    
    public void GetPassword(String Password)
    {
    	EnterPassword.sendKeys(Password);
    }
    
    public void GetConfPassword(String Password)
    {
    	EnterCPassword.sendKeys(Password);
    }
    
    public void ClickReg()
    {
    	ClickRegisterBtn.click();
    }
    
    
}
