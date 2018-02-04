package example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preference_dependencies extends SetUp{
	
	public Preference_dependencies(AppiumDriver driver)
	{		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}

	@AndroidFindBy(id="android:id/checkbox")
	public WebElement WiFi_checkbox;
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement WiFi_settings;
	
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement WiFi_name;
	
	@AndroidFindBy(id="android:id/button1")
	public WebElement OKButton;
	
	public void WiFi_checkbox()
	{
		WiFi_checkbox.click();
		System.out.println("Clicked on WiFi checkbox");
	}
	
	public void WiFi_settings()
	{
		WiFi_settings.click();
		System.out.println("Clicked on WiFi settings");
	}
	
	public void WiFi_name()
	{
		WiFi_name.sendKeys("home");;
		System.out.println("Entered WiFi name");
	}
	
	public void OKButton()
	{
		OKButton.click();
		System.out.println("Clicked on OK Button");
	}
}
