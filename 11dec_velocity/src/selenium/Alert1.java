package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/login.html");
		 
		  driver.manage().window().maximize();Thread.sleep(1000);
		  driver.navigate().refresh();Thread.sleep(1000);	  
		
driver.findElement(By.xpath("//a[text()='Tabs']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[text()='Close']")).click();Thread.sleep(1000);
driver.findElement(By.xpath("(//span[text()='Drag And Drop'])[3]")).click();
Thread.sleep(1000);
Actions act=new Actions(driver);

WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
WebElement drop=driver.findElement(By.id("trash"));
act.dragAndDrop(drag,drop).perform();Thread.sleep(1000);



	}

}
