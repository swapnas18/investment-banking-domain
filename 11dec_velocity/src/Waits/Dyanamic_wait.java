package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dyanamic_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.discoveryplus.in/");
		 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	WebElement signinbutton=driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
	signinbutton.click();
	driver.findElement(By.id("mobileNumber")).sendKeys("8884567890");
	WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(1000));
	WebElement getotp = driver.findElement(By.xpath("//button[@type='submit']"));
	w.until(ExpectedConditions.visibilityOf(getotp));
	getotp.click();
	}

}
