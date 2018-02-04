package example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Text_page extends SetUp{
	
	public Text_page(AppiumDriver driver)
	{		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='LogTextBox']")
	public WebElement LogTextBox;
	
	@AndroidFindBy(id="io.appium.android.apis:id/add")
	public WebElement Add;
	
	public void LogTextBox()
	{
		LogTextBox.click();
		System.out.println("Clicked on LogTextBox");
	}
	
	public void Add()
	{
		Add.click();
		System.out.println("Clicked on Add");
	}

}
