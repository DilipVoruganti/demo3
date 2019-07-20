package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D://Softwares//chromedriverwin32//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get("https://demo.opencart.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		
		if(title.equalsIgnoreCase("Your Store"))
		{
			System.out.println("URL loaded successfully");
		}else
		{
			System.out.println("URL not loaded succesfully");
		}
		driver.findElement(By.name("search")).sendKeys("phone");
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		new Select(driver.findElement(By.name("category_id"))).selectByIndex(1);
		driver.findElement((By.name("sub_category"))).click();
		driver.findElement(By.id("button-search")).click();
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
		driver.findElement(By.xpath("//div[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\'accordion\']/div[1]/div[1]/h4/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'input-coupon\']")).sendKeys("GET100");
		
	}

}
