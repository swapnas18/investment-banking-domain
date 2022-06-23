package TEStNG;

import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class snap {
	WebDriver driver;
	@BeforeClass
	
	public void lounch() {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.zomato.com/");
	      driver.manage().window().maximize();}
//	@BeforeTest
//		  public void beforeTest() throws IOException   {
//			  File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				System.out.println(source);
//				String str= RandomString.make(3);
//				File  dest=new File("D:\\Seleniumscreenshot\\zomato"+str+".png");
//				FileHandler.copy(source, dest);  }
@Test
  public void root() {
	 driver. findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[3]/input")).sendKeys("pizza");
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[3]/input")).click(); 
	 }
 
  @AfterTest
  public void afterTest() throws IOException {
	  File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		String str= RandomString.make(3);
		File  dest=new File("D:\\Seleniumscreenshot\\zomato"+str+".png");
		FileHandler.copy(source, dest); }

 @AfterClass
  public void afterClass() {
	  driver.quit();
  }
}