package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://demo.guru99.com/popup.php");
		  driver.manage().window().maximize();Thread.sleep(1000);
//driver.navigate().refresh();Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/p/a")).click();Thread.sleep(1000);
	
	          Set<String> secondwindow = driver.getWindowHandles();	
	           Iterator<String>  it= secondwindow.iterator();
	  String parent = it.next();
	  String child=it.next();
  driver.switchTo().window(child);
	driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("shindesapana2019@gmail.com");
	Thread.sleep(1000);	
	driver.findElement(By.name("btnLogin")).click();
	driver.close();
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("/html/body/p/a")).click();Thread.sleep(100)

;	
	driver.quit();
	
	
	}

}
