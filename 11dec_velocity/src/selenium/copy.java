package selenium;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class copy {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
//	Open chrome browser	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();          //Upcasting
		
		driver.get("https://www.facebook.com/login/");   //get Url method
		
		Thread.sleep(2000); 
		
		driver.manage().window().maximize();             // maximize or minimize window
	
		Thread.sleep(2000);                           // 2 sec exception
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("------ID-------");//findElement method
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("-------password---------");
		
		Thread.sleep(2000);
	WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		login.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'ow4ym5g4 auili1gw rq0escxv j83agx80')])[16]")).click();
	
		
		
	}

	
	}