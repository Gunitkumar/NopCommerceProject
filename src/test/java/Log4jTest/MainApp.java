package Log4jTest;

import org.apache.log4j.Logger;

public class MainApp {
  static 	Logger LoggerObj = Logger.getLogger(MainApp.class);
	public static void main(String[] args) {
		System.out.println("my first program\r\n"+"");
		LoggerObj.info("this is a error");
		LoggerObj.debug("My msg");
		

	}

}
