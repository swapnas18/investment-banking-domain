package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mutielement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in//");
		Thread.sleep(100);
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("pizza");
	 Thread.sleep(10000);
	 List<WebElement> search = driver.findElements(By.xpath("//ul//li"));
	 System.out.println(search.size());  
	for(WebElement w:search) {
	String s = w.getText();
	System.out.println(s);
	if(s.contains("Pizza Hut")) {
	w.click();
		break;
	
	}
	
	}	
	}
}
