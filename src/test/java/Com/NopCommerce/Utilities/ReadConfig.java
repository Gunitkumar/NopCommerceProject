package Com.NopCommerce.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;

public class ReadConfig {
	
	   Properties prop;
	   public ReadConfig ()
	   {	
		   File src = new File ("./Configuration/config.properties");
	      try {
		    FileInputStream fis = new FileInputStream (src);
		    prop= new Properties();
		    prop.load(fis);
		   
	   }catch(Exception e)
	   {
		   System.out.println("Exception is "+e.getMessage());
	   }
		  
	   }
	   
	   public String GetApplicationUrl()
	   {
		   String url = prop.getProperty("BaseUrl");
		   return url;
	   }
	   
	   public String GetUserName()
	   {
		   String username = prop.getProperty("username");
		   return username;
		   
	   }
	   
	   public String GetUserPassword()
	   {
		   String password = prop.getProperty("Password");
			return password;
	   }
	   
	   
	   public String GetChromePath()
	   {
		   String chromepath = prop.getProperty("chromepath");
		   return chromepath;
	   }
	   
	   public String GetEdgePath()
	   {
		   String edgepath = prop.getProperty("edgepath");
		   return edgepath;
		   
	   }
	   
	   public String GetFireFoxPath()
	   {
		   String firefoxpath = prop.getProperty("firefoxpath");
		   return firefoxpath;
	   }
	   
	   
	
	   
	

}
