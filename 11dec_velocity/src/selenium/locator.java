package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class locator{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

//driver.get("https://www.instagram.com");
//driver.manage().window().maximize();
//Thread.sleep(1000);
//WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//username.sendKeys("sapna shinde");
//Thread.sleep(1000);
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ss1998");
//Thread.sleep(1000);
driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("sapna shinde");
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.moveToElement(username).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ss1998");
		Thread.sleep(1000);
	 	username.sendKeys("Swapnali shinde");
}}
