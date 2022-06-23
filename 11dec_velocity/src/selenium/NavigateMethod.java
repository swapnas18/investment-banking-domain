package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
			driver .manage().window().maximize();
	Thread.sleep(300);
		driver.manage().window().minimize();
		Thread.sleep(300);
		
	driver.get("https://www.flipkart.com/");
	
		Thread.sleep(300);
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(300);
		driver.navigate().back();
		Thread.sleep(300);
		driver.navigate().forward();
		Thread.sleep(300);
		
		driver.navigate().refresh();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(300);
		  
	System.out.println(driver.getCurrentUrl());
	driver.close();

		
		
	}

}
