package testNg;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Practise {
  static WebDriver driver;
	
	@Test(groups={"init","Sanity"},priority=1)
  public void searchFunctionality() {
	  //System.out.println("Test1");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		Assert.assertEquals(title, "Your Store");
		/*if(title.equalsIgnoreCase("Your Store"))
		{
			System.out.println("URL loaded successfully");
		}else
		{
			System.out.println("URL not loaded succesfully");
		}*/
		driver.findElement(By.name("search")).sendKeys("phone");
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		new Select(driver.findElement(By.name("category_id"))).selectByIndex(1);
		driver.findElement((By.name("sub_category"))).click();
		driver.findElement(By.id("button-search")).click();
	  
  }
  
 @Test(groups= {"Regression"},priority=2)
  public void cartfuncationality() {
	 System.out.println("cartfuncationality");
	 driver.findElement(By.xpath("//img[@title='iPhone']")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("3");
		driver.findElement(By.id("button-cart")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
	
		
		//Thread.sleep(5000);
		driver.findElement(By.id("cart-total")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='cart']/ul/li//tr/td[2]"), "iPhone"));
				
		String addedcart=driver.findElement(By.xpath("//div[@id='cart']/ul/li//tr/td[2]")).getText();
		System.out.println(addedcart);
		String quantity=driver.findElement(By.xpath("//div[@id='cart']/ul/li//tr/td[3]")).getText();
		System.out.println(quantity);
	  
  }
  
 /* @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
	  
  }*/

  @BeforeTest(groups= {"init"})
  @Parameters({"url"})
  public void beforeTest(String surl) {
	  //System.out.println("BeforeTest");
	  driver.get(surl);
	  
  }

 /* @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
	  
  }
*/
  @BeforeSuite(groups= {"init"})
  @Parameters({"browser"})
  public void beforeSuite(String sbrowser) {
	  
	  if(sbrowser.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","D://Softwares//chromedriverwin32//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		driver=new ChromeDriver();
	  //System.out.println("BeforeSuite");
	  }
	  else if(sbrowser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();	  
			  }
	  else if(sbrowser.equalsIgnoreCase("ie"))
	  {
		  System.setProperty("webdriver.ie.driver", "D:\\Softwares\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			driver=new InternetExplorerDriver();	 
	  }
	  else
	  {
		  System.out.println("Invalid Browser: "+sbrowser);
	  }
	  
  }

  @AfterSuite(groups= {"init"})
  public void afterSuite() {
	  System.out.println("AfterSuite");
	  driver.quit();
	  
  }

}
