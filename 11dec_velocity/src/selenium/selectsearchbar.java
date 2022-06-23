package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectsearchbar {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver= new ChromeDriver(); driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement popup = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
popup.click();
driver.findElement(By.name("q")).sendKeys("laptop");Thread.sleep(2000);
 driver.findElement(By.xpath("//button[@type='submit']")).click();Thread.sleep(2000);
 WebElement rating = driver.findElement(By.xpath("(//span[contains(text(),'Ratings')])[1]"));		 
		System.out.println("rating "+rating.getText());
		

		  
		  }
	
}
