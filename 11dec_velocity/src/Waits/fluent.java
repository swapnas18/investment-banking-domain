package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		
		 
			 //WebDriver driver= new ChromeDriver();
			 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
				
				driver.get("https://www.discoveryplus.in/");
				driver.manage().window().maximize();
				WebElement signinbutton=driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
	
				signinbutton.click();	
	driver.findElement(By.id("mobileNumber")).sendKeys("8884567890");
	
	WebElement getotp = driver.findElement(By.xpath("//button[@type='submit']"));
	//w.until(ExpectedConditions.visibilityOf(getotp));
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			 ((FluentWait<WebDriver>) wait).withTimeout(Duration.ofSeconds(30));
			  ((FluentWait<WebDriver>) wait).pollingEvery(Duration.ofSeconds(5));
			  wait.until(ExpectedConditions.visibilityOf(getotp));
	getotp.click();

	}

}
