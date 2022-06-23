package Excel_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerothaWithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
   driver.get("https://kite.zerodha.com/");  Thread.sleep(200);
   driver.manage().window().maximize();
	 Thread.sleep(1000);
	WebElement userIdField = driver.findElement(By.id("userid"));
	WebElement PasswordField = driver.findElement(By.id("password"));
 WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
 userIdField.sendKeys("HD5857");
 PasswordField.sendKeys("Ajinkya@123");
 loginButton.click();
 Thread.sleep(1000);
WebElement pinField=driver.findElement(By.id("pin"));
WebElement continueButton=driver.findElement(By.xpath("//button[@type='submit']"));
pinField.sendKeys("969696");
continueButton.click(); 
Thread.sleep(1000);	
WebElement ShowingId = driver.findElement(By.xpath("//span[@class='user-id']"));
String actualResult = ShowingId.getText();
 String expectedResult="HD5857";
if(actualResult.equals(expectedResult)) {
	System.out.println("test case pass");
}
Thread.sleep(1000);
ShowingId.click();
driver.findElement(By.xpath("//a[@target='_self']")).click();
Thread.sleep(2000);
System.out.println(" log out succesfull");
driver.close();



	}

}
