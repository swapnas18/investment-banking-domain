package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text_use {

	public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.get("https://www.flipkart.com/");
  driver.manage().window().maximize();
   WebElement webele = driver.findElement(By.xpath("//span[text()='Get access to your Orders, Wishlist and Recommendations']"));
  String actualstring= webele.getText();
  System.out.println("text is "+ actualstring);
  String expectesstring= "Get access to your Orders, Wishlist and Recommendations";
 if(actualstring.equals(expectesstring)) {
	  System.out.println(" test case is passed");
	  
  }
 else {
	 System.out.println("test case is fail ");
 }
		
	}

}
