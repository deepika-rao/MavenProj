package example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends SetUp{
	
	//private static AppiumDriver driver;
	
	public HomePage(AppiumDriver driver)
	{		
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Accessibility']")
	public WebElement Accessibility;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Animation']")
	public WebElement Animation;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='App']")
	public WebElement App;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Content']")
	public WebElement Content;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Graphics']")
	public WebElement Graphics;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Media']")
	public WebElement Media;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='NFC']")
	public WebElement NFC;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='OS']")
	public WebElement OS;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement Preference;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Text']")
	public WebElement Text;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Views']")
	public WebElement Views;
	
	
	public void Accessibility()
	{
        Accessibility.click();
		System.out.println("Clicked on Accessibility");
	}
	
	public void Animation()
	{
        Animation.click();
		System.out.println("Clicked on Animation");
	}
	
	public void App()
	{  
		App.click();
		System.out.println("Clicked on App");
	}
	
	public void Content()
	{
		Content.click();
		System.out.println("Clicked on Content");
	}
	
	public void Graphics()
	{
        Graphics.click();
		System.out.println("Clicked on Graphics");
	}
	
	public void Media()
	{ 
		Media.click();
		System.out.println("Clicked on Media");
	}
	
	public void NFC()
	{
		NFC.click();
		System.out.println("Clicked on NFC");
	}
	
	public void OS()
	{
        OS.click();
		System.out.println("Clicked on OS");
	}
	
	public void Preference()
	{
        /*WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Preference)); */
        Preference.click();
		System.out.println("Clicked on Preference");
	}
	
	public void Text()
	{ 
        Text.click();
		System.out.println("Clicked on Text");
	}
	
	public void Views()
	{  
        Views.click();
        System.out.println("Clicked on Views");
	}
	
	
}
