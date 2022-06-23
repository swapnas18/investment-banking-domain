package SSbasepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class Base {
protected	WebDriver driver;
	@Parameters("browsername")
	public  void Browser(String browser) {

		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		if (browser.equals("chrome"))	{
		 driver= new ChromeDriver();}
			
		else if(browser.equals("firefox")) {
	
	 System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		 
		 driver=new FirefoxDriver();}
		 
		 driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
	
	}
	public void Browerclose() {
		driver.close();
	}

}
