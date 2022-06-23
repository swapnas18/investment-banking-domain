package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(200);
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		 WebElement Password=  driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		 String U="Admin";
		 Username.sendKeys(U);
		 String P="admin123";
		 Password.sendKeys(P);
		 WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		 Thread.sleep(1000);
	loginbutton.click();
		

	}

}