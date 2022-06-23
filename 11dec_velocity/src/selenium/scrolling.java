package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		
		 Thread.sleep(2000);
    	 JavascriptExecutor  scrol=(JavascriptExecutor)driver;
 	     scrol.executeScript("window,scrollBy(0,140)");


	}

}
