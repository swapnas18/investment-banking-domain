package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");  Thread.sleep(200);
		  driver.manage().window().maximize();  Thread.sleep(200);
           driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[@type='button']")).click();
Thread.sleep(300);
driver.switchTo().defaultContent();
driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();

//Thread.sleep(300);
//driver.switchTo().defaultContent();
//driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();


	}

}
