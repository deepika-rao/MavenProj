package example.Pages;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;

public class Methods extends SetUp{
	
	private AppiumDriver driver;
	
	public Methods(AppiumDriver driver)
	{		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	public void waitcommand() throws InterruptedException
	{
		Thread.sleep(30);;
	}
	
	public boolean VerifyPage(String xpath, String pagetitle)
	{
		Assert.assertTrue(xpath.contains(pagetitle));
	     
	     System.out.println("Testing Passed");
	     
		return false;
	}   
	
	
}
