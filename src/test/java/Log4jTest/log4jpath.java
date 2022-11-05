package Log4jTest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log4jpath {
	
	public static Logger Logger;
	public static void loadlog4j()
	{
		String Log4jPath  = System.getProperty("user.dir")+"/log4j.properties";
		PropertyConfigurator.configure(Log4jPath);
		Logger.error("This is error");
	}
	
	public static void main (String[]args)
	{
		Logger.info("thus is kscnds");
	}
	
	

}
