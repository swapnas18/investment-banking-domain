package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_enable_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.discoveryplus.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	WebElement signinbutton=driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
	signinbutton.click();
	 Thread.sleep(2000);
	WebElement getotp = driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println(getotp.isEnabled());
	boolean result=getotp.isEnabled();
	System.out.println( "get otp butten" + result);
	if(result)
	{System.out.println("get otp butten enabled");
	getotp.click();
		
	}else {
		driver.findElement(By.xpath(	"//input[@id='mobileNumber']")).sendKeys("9098766587");
		Thread.sleep(200);
		getotp.click();	}
	//input[@id='mobileNumber']
	}

}
