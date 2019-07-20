package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PomTest.Configuration;

public class LoginPage extends Configuration {

	@FindBy( id="txtUsername")
	WebElement userNameField;
	
	@FindBy( id="txtPassword")
	WebElement userPassword;
	
	@FindBy( id="btnLogin")
	WebElement loginbtn;
	
	public HomePage login(String userName, String Password)
	{
		userNameField.sendKeys(userName);
		userPassword.sendKeys(Password);
		loginbtn.click();
		return new HomePage();
	}
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

}
