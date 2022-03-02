package pomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_test;

public class FacebookLogin extends Base_test
{
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement psswd;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement lgn_btn;
	
	public FacebookLogin(WebDriver driver)
	{
		super(driver);
	}
	
	public void username(String usern)
	{
		user.sendKeys(usern);
	}
	
	public void password(String passw)
	{
		psswd.sendKeys(passw);
	}
	
	public void log_in()
	{
		lgn_btn.click();
	}
	
}
