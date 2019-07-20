package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://Softwares//chromedriverwin32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("C:\\Users\\KITC22006\\Downloads\\sample.html");
	}

}
