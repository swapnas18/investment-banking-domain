package TEStNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Testngasserts {
  @Test
  public void is_equal() { 
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	  driver.get("https://duckduckgo.com/");
      String actualTitle = "DuckDuckGo — Privacy, simplified.";

      String expectedTitle = driver.getTitle();
    // String expectedText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]")).getText();
    Assert.assertEquals(actualTitle,expectedTitle);

      
  //  Assert.assertEquals("Privacy Protection For Any Device", expectedText);
}


	  
  }

