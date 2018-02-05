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
  public void Test1() throws InterruptedException {
	  methods.waitcommand();
	  
	  methods.log("Launched application");
		
		homescreen.Preference();
		
		methods.log("Clicked on Preference");
		
		prefpage.Preference_dependencies();	
		
		methods.log("Clicked on Preference dependencies");
		
		methods.waitcommand();
		
		prefdep.WiFi_checkbox();
		
		methods.log("Clicked on Wifi checkbox");
		
		prefdep.WiFi_settings();
		
		methods.log("Clicked on Wifi settings");
		
		prefdep.WiFi_name();
		
		methods.log("Clicked on Wifi name");
		
		prefdep.OKButton();
		
		methods.log("Clicked on OK button");
		
		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);	
  }
 
}
