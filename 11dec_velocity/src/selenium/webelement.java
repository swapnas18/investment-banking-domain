package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://phptravels.com/demo/");
		 Thread.sleep(200);
 WebElement signbutton = driver.findElement(By.xpath("//a[text()='Sign up']"));
 signbutton.click();
Thread.sleep(200);
System.out.println("click on  sign in button"+ signbutton );
boolean result =signbutton.isEnabled();
System.out.println(result);
if (result)
{
	System.out.println(" click on sign in page");
} 
else {
	
	signbutton.click();
	Thread.sleep(200);
	System.out.println("click on sign in button ");
	
}



	}

}
