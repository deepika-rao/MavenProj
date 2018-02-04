package example.Pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SetUp {
	
	static Properties properties;
		
	public static AndroidDriver<WebElement> Set_Up() throws IOException{	
		
		AndroidDriver<WebElement> driver;
		
		properties = new Properties();
		
		File f = new File(System.getProperty("user.dir")+"\\src\\properties_file\\config.properties");
		
		FileReader obj = new FileReader(f);
		
		properties.load(obj);
		
			//Setting desired capabilities
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getProperty("PLATFORM_NAME"));
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("DEVICE_NAME"));
			
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "50");
			
			cap.setCapability(MobileCapabilityType.APP, properties.getProperty("APP"));	
		
			driver = new AndroidDriver<WebElement>(new URL(properties.getProperty("AppiumURL")),cap);
			
			return driver;
	}
	
			
		
}
	
	


