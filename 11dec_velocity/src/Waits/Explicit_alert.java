package Waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");  
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.navigate().refresh();
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(5000));
		WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		clickMeButton.click();
w.until(ExpectedConditions.alertIsPresent());
Alert a= driver.switchTo().alert();
a.dismiss();
	}

}
