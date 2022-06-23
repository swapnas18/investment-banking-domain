package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpath1 {


	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

	   WebDriver driver =new ChromeDriver();
		
       driver.get("https://www.irctc.co.in/nget/train-search");		
       driver.manage().window().maximize();
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
       
       driver.findElement(By.xpath("//a[@aria-label='Click here to Login in application']")).click();
		
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@formcontrolname='userid']")).sendKeys("sapna");
		
	   Thread.sleep(2000);
		
	   driver.findElement(By.xpath("//input[@type='password']]")).sendKeys("sapna");
	   Thread.sleep(2000);

	   
	}

}
