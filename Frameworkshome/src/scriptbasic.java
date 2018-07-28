import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class scriptbasic {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("http://www.facebook.com");
	WebElement ref=driver.findElement(By.id("email"));
	ref.sendKeys("reshma.kumari92@gmail.com");
	WebElement ref1=driver.findElement(By.id("pass"));
	ref1.sendKeys("eshma@123456");
	WebElement ref2=driver.findElement(By.id("u_0_2"));
	ref2.click();
	
	Thread.sleep(2000);
	
	WebElement ref3=driver.findElement(By.xpath("//div[contains(text(),'The password that you')]"));
	String ref4=ref3.getText();System.out.println(ref4);String ref5=ref3.getCssValue("color");String ref6=Color.fromString(ref5).asHex();System.out.println(ref6);
	Date r=new Date();
	String r1=r.toString();
	String f=r1.replaceAll(":","_").toString();
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(".\\scd\\"+f+"ress.png");
	FileUtils.copyFile(src, dest);
	
	/*WebElement ref3=driver.findElement(By.xpath("//span[text()='Reshu']"));
	ref3.click();
	Actions ac=new Actions(driver);
	WebElement ref4=driver.findElement(By.xpath("//a[text()='More']"));
	WebElement ref5=driver.findElement(By.xpath("//span[text()='Books']"));
	ac.moveToElement(ref4).moveToElement(ref5).click().build().perform();
	
	*/
}
}
