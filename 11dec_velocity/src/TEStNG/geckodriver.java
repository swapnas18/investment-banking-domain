package TEStNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class geckodriver {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.get("http://demo.guru99.com/test/login.html");
	 
	  driver.manage().window().maximize();
	
	 
	 
  }
}
