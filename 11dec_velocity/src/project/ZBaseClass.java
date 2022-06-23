package project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;



public class ZBaseClass {

	WebDriver driver;
	@Parameters ("browsername")
	public void browserlounch(String browser) {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	
	if (browser.equals("chrome"))	{
			 driver= new ChromeDriver();
	}
			
			else if (browser.equals("firefox")) {
				driver=new FirefoxDriver();
					}
	 driver.get("https://kite.zerodha.com/");  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));}
			}




