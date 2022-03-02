package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_test extends Base_Class
{
	
	public Base_test(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
