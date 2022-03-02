package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_Class;
import generic.Generic_excel;
import pomScripts.FacebookLogin;

public class TestScriptLogin extends Base_Class
{
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		String username = Generic_excel.get_Data("Sheet1", 0, 0);
		String password = Generic_excel.get_Data("Sheet1", 1, 0);
		
		FacebookLogin fb=new FacebookLogin(driver);
		fb.username(username);
		fb.password(password);
		fb.log_in();
		Assert.fail();	
		}
}