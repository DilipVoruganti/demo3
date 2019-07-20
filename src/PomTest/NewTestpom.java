package PomTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class NewTestpom extends Configuration {
	LoginPage loginobj;
	HomePage homeobj;
	
	@BeforeTest
	public void Login() {
		loginobj=new LoginPage();
		homeobj=loginobj.login("admin", "admin123");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	@Test
	public void verifyLogin( ) {
		/*loginobj=new LoginPage();
		loginobj.login("admin", "admin123");*/
		//homeobj=new HomePage();
		homeobj.verifyHomepage();
	}
}
