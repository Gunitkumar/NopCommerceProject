package Com.NopCommerce.TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Com.NopCommerce.Utilities.ExtenreportNG;
import Com.NopCommerce.Utilities.ReadConfig;
import Com.NopCommerce.Utilities.Reporting;

public class BaseClass extends ExtenreportNG {
	
		ReadConfig rc = new ReadConfig();
		
		public String BaseUrl = rc.GetApplicationUrl();
		public String username = rc.GetUserName();
		public String password= rc.GetUserPassword();
		public static WebDriver driver;
		public static Logger Logger;
		
		@Parameters("browser")
		@BeforeClass
		public void setup (String br)
		{
			
			Logger = Logger.getLogger(Tc_CustReg_001.class);
			PropertyConfigurator.configure("Log4j.properties");
			if(br.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", rc.GetChromePath());
				driver= new ChromeDriver();
				
			}
			else if(br.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", rc.GetFireFoxPath());
				driver = new FirefoxDriver();
				
			}
			else if(br.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver", rc.GetEdgePath());
				driver = new EdgeDriver();
				
			}
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(BaseUrl);
			
		}
		@AfterClass
		public void TearDown()
		{
			
			driver.quit();
		}
		
		public  String  RandomString()
		{
			String generateRdString = RandomStringUtils.randomAlphabetic(8);
			return generateRdString;
			
			
		}
		
}
