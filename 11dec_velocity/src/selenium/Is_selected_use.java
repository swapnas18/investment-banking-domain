package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected_use {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://vctcpune.com/");
 driver.manage().window().maximize();
 Thread.sleep(200);
 driver.navigate().to("https://vctcpune.com/selenium/practice.html");
 Thread.sleep(200);
  WebElement option1radiocheckbox = driver. findElement(By.xpath("//input[@value='Radio1']"));
  System.out.println("click on checkbox1"+option1radiocheckbox );
 // option1radiocheckbox.click()
;  boolean result= option1radiocheckbox.isSelected();
  if(result) {
	  System.out.println(" butten allready selected ");
  } else {
	  System.out.println(" check box not selected");
	  option1radiocheckbox.click();
	Thread.sleep(200);
	boolean result2=  option1radiocheckbox.isSelected();
	System.out.println("updated checkbox selected status"+result2 );
  }
  
 }

}
