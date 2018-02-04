package example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Preference_page extends SetUp{
	
//private AppiumDriver driver;
	
	public Preference_page(AppiumDriver driver)
	{		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='1. Preferences from XML']")
	public WebElement Preferences_from_XML;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='2. Launching preferences']")
	public WebElement Launching_preferences;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement Preference_dependencies;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='4. Default values']")
	public WebElement Default_values;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='5. Preferences from code']")
	public WebElement Preferences_from_code;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='6. Advanced preferences']")
	public WebElement Advanced_preferences;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='7. Fragment']")
	public WebElement Fragment;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='8. Headers']")
	public WebElement Headers;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='9. Switch']")
	public WebElement Switch;
	
	public void Preferences_from_XML()
	{
		Preferences_from_XML.click();
		System.out.println("Clicked on Preferences from XML");
	}
	
	public void Launching_preferences()
	{
		Launching_preferences.click();
		System.out.println("Clicked on Launching preferences");
	}
	
	public void Preference_dependencies()
	{
		Preference_dependencies.click();
		System.out.println("Clicked on Preference dependencies");
	}
	
	public void Default_values()
	{
		Default_values.click();
		System.out.println("Clicked on Default values");
	}
	
	public void Preferences_from_code()
	{
		Preferences_from_code.click();
		System.out.println("Clicked on Preferences from code");
	}
	
	public void Advanced_preferences()
	{
		Advanced_preferences.click();
		System.out.println("Clicked on Advanced preferences");
	}
	
	public void Fragment()
	{
		Fragment.click();
		System.out.println("Clicked on Fragment");
	}
	
	public void Headers()
	{
		Headers.click();
		System.out.println("Clicked on Headers");
	}
	
	public void Switch()
	{
		Switch.click();
		System.out.println("Clicked on Switch");
	}
	
	

}
