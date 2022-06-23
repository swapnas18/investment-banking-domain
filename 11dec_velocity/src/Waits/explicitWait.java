package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		
		 
			 //WebDriver driver= new ChromeDriver();
			 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
				
				driver.get("https://www.discoveryplus.in/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				WebElement SignInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
				SignInButton.click();
				Thread.sleep(2000);
				
				WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
				//System.out.println(getOTPButton.isEnabled());
				
				boolean result = getOTPButton.isEnabled();
				
				System.out.println("getOTPButton status is "+result);
				
				if(result)
				{
					System.out.println("Get OTP Button is enabled");
					getOTPButton.click();
				}
				else {
					driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
					Thread.sleep(100);
					getOTPButton.click();
					System.out.println("Clicked on get OTP button");
					
				}

			}
}
