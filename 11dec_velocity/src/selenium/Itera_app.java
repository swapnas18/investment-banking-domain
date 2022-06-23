package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.Timeout;

public class Itera_app {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://itera-qa.azurewebsites.net/home/automation");  
		  driver.manage().window().maximize();  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		  driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("sapna"); 		  
		  driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9098768787");
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sapna@99gmail.com");
		WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(5000));
	 WebElement selectTool = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
	selectTool.click();
	w.until(ExpectedConditions.elementToBeSelected(selectTool));
	 WebElement selectTool3 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[8]"));
	 selectTool3.click();
	 w.until(ExpectedConditions.elementToBeSelected(selectTool));
	 WebElement selectTool4 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[8]"));
	selectTool4.click();
	 w.until(ExpectedConditions.elementToBeSelected(selectTool4));
	}

}
