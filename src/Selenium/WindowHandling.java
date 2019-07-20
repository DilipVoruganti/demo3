package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://Softwares//chromedriverwin32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("C:\\Users\\KITC22006\\Downloads\\sample.html");
		System.out.println("Before Switching "+driver.getTitle());
		String cwindowhandle=driver.getWindowHandle();
		driver.findElement(By.linkText("Yahoo")).click();
		Set<String> awhandles = driver.getWindowHandles();
		for(String s:awhandles)
		{
			if(!s.equals(cwindowhandle))
			{
				driver.switchTo().window(s);
			}
	}
		System.out.println("After Switching "+driver.getTitle());

}
}
