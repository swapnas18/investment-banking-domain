package TEStNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class  ParrellelExecution3 {
  @Test
  public void KiteLogin() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		Reporter.log("KiteLaunched",true);
		Thread.sleep(2000);
		driver.close();
  }

}
