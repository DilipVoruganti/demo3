package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PomTest.Configuration;

public class HomePage extends Configuration{

	@FindBy( id="welcome")
	WebElement welcometext;
	
	@FindBy( id="menu_admin_viewAdminModule")
	WebElement AdminLink;
	
	public void verifyHomepage()
	{
		String text=welcometext.getText();
		Assert.assertEquals(text,"Welcome Admin");
	}
	public void navigatetoAdminPage()
	{
		AdminLink.click();
	}
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
}
