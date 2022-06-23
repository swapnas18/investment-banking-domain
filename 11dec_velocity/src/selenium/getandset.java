package selenium;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getandset {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
 driver.get("https://opensource-demo.orangehrmlive.com/");  Thread.sleep(200);
 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 WebElement Username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
	 WebElement Password=  driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
	 String U="Admin";
	 Username.sendKeys(U);
	 String P="admin123";
	 Password.sendKeys(P);
	 WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
	 Thread.sleep(1000);
	 loginbutton.click();
	 
System.out.println(" default size of window"+driver.manage().window().getSize());


JavascriptExecutor j = (JavascriptExecutor)driver;
j.executeScript("window.resizeTo(-50,-50)");
System.out.println(driver.manage().window().getSize());







//;	 WebElement s = driver.findElement(By.id("divUsername"));
//		System.out.println( "username box size "+s.getSize());
//		Thread.sleep(2000);
//		Dimension dm = new Dimension(300,400);
//	dm.setSize((Dimension) driver);
//		Thread.sleep(2000);
		 
//		JavascriptExecutor j = (JavascriptExecutor)driver;
//		j.executeScript("window.resizeTo(950,500)");
//		System.out.println("update size"+ s.getSize());
	
	
	
	}

	
}


