package SSbasepackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;


import SSUility.utility_using_propertiesFile;

public class BaseusingpropertiesFile {
protected WebDriver driver;
	@Parameters("browsername")
		public  void Browser(String browser) throws IOException {
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");
			 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			if (browser.equals("chrome"))	{
			 driver= new ChromeDriver(opt);}
				
			else if(browser.equals("firefox")) {
		
		 System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			 FirefoxOptions oo= new FirefoxOptions();
			 oo.addArguments("--disable-notifications");
			 driver=new FirefoxDriver(oo);}
			 
			 driver.get(utility_using_propertiesFile.getData("Url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
				
		
		}
		public void Browerclose() {
			
			driver.close();
		}
	
	}
	


