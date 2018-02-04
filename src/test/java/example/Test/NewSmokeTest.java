package example.Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import example.Pages.HomePage;
import example.Pages.Methods;
import example.Pages.Preference_dependencies;
import example.Pages.Preference_page;
import example.Pages.SetUp;
import example.Pages.Text_page;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class NewSmokeTest extends SetUp{
	
private static AppiumDriver driver;
	
	//AndroidDriver<AndroidElement> ldriver;
	
	private Methods methods;
	
	private HomePage homescreen;
	
	private Preference_page prefpage;
	
	private Preference_dependencies prefdep;
	
	private Text_page textpage;
	
	@BeforeSuite
	public void SetBase() throws IOException{		
		
		driver = Set_Up();
		
		homescreen = new HomePage(driver);
		
		prefpage = new Preference_page(driver);
		
		methods = new Methods(driver);
		
		prefdep =new Preference_dependencies(driver);
		
		textpage =new Text_page(driver);
		
	}
	
  @Test
  public void f() throws InterruptedException {
	  methods.waitcommand();
		
		homescreen.Preference();
		
		prefpage.Preference_dependencies();	
		
		methods.waitcommand();
		
		prefdep.WiFi_checkbox();
		
		prefdep.WiFi_settings();
		
		prefdep.WiFi_name();
		
		prefdep.OKButton();
		
		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);	
  }
 
}
