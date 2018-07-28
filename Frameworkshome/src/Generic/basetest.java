package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class basetest implements iautconstant {
	public static WebDriver driver;
	static{
		System.setProperty(Gecko_key,Gecko_value);
	}
	
@BeforeMethod
public void openapp(){
	 driver=new FirefoxDriver();
	String url1=lib.propertiess(prop_path);
	driver.get(url1);
}
}
