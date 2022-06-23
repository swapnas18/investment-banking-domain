package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("swapna shinde");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("swapna@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/accounts/password/reset/']")).click();
	
		//xpath by text=
		//h1[text()='Instagram'];
		//p[text()='Get the app.']////h4[text()='Trouble Logging In?']
		
	//xpath by contains
	//p[ contains(text(),'Get the a')]
		//h4[ contains (text(),'Trouble ')]
	}

}
