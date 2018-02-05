package example.Pages;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
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
	
	public static String log(String message) 
	{
		
		Logger logger = Logger.getLogger("NewSmokeTest");
		
		PropertyConfigurator.configure("log4j.properties");	
		
		logger.info(message);
		
		return null;
		
	}
	
	
}
