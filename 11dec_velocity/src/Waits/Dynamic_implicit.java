package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class Dynamic_implicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.manage().window().maximize();  
		driver.navigate().refresh();
		
		driver.switchTo().frame("frame-one1434677811");
		
		 driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("swapnali shinde");
		 
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("shinde");

				  driver.findElement(By.xpath("//input[@name='RESULT_TextField-3']")).sendKeys("7676768732");
				  
			

	}

}
