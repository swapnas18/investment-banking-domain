package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectdropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/auto-complete");
		Thread.sleep(200);
       driver.navigate().to("https://demoqa.com/select-menu");
		Thread.sleep(200);
		WebElement multiselectbox = driver.findElement(By.name("cars"));		
	Select s=new Select(multiselectbox);
	boolean result =s.isMultiple();
	System.out.println(" multiselectbox"+ result);
	s.selectByValue("volvo");
	Thread.sleep(200);
	s.selectByIndex(3);
	Thread.sleep(200);
	s.selectByVisibleText("Saab");
	Thread.sleep(2000);
	
	s.deselectByIndex(3);
	Thread.sleep(2000);
	
		
	}

}
