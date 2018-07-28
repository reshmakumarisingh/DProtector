package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class crusade {
	@FindBy(id="email")
	private WebElement usrn;
	@FindBy(id="pass")
    private WebElement pswd;
	@FindBy(id="u_0_2")
	private WebElement clk;
	
	public crusade(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void setusd(String userid){
		usrn.sendKeys(userid);
	}
	public void setpsd(String pswd1){
		pswd.sendKeys(pswd1);
	}
	public void setclk(){
		clk.click();
	}
}
