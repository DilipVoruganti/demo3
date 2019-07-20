package testNg;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewTest2 {
	static WebDriver driver;
	
  @Test  
  public void f() throws MalformedURLException {
	  String huburl="http://localhost:4444/hub";
	  DesiredCapabilities cap=DesiredCapabilities.chrome();
	  cap.setPlatform(Platform.WINDOWS);
	  driver=new RemoteWebDriver(new URL(huburl),cap);
	  
	  driver.get("https://www.yahoo.com");
  }
}
