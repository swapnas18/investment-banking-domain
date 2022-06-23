package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CT {
	  WebDriver driver ;
	@Parameters("browsername")
  @Test
  public void firefox(String name) throws InterruptedException {
		if(name.equals("firefox")) {
	  System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();}
	  else if(name.equals("Chrome")) {
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			
		 driver= new ChromeDriver();}
	  driver.get("https://kite.zerodha.com/");  Thread.sleep(200);
	  driver.manage().window().maximize();

}}
