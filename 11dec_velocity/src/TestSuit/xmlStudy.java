package TestSuit;

import org.testng.annotations.Test;

import net.jodah.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class xmlStudy {
	 WebDriver driver;
	 WebElement ShowingId;
	 @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
	driver.get("https://kite.zerodha.com/"); 
	driver.manage().window().maximize(); }
  @Test
  public void logIn() {
	  ShowingId = driver.findElement(By.xpath("//span[@class='user-id']"));
	  String actualResult = ShowingId.getText();
	   String expectedResult="HD5857";
	  if(actualResult.equals(expectedResult)) {
	  	Reporter.log("Log in successful!!!!!",true);}}
  
  @BeforeMethod
  public void beforeMethod() {
	  WebElement userIdField = driver.findElement(By.id("userid"));
	WebElement PasswordField = driver.findElement(By.id("password"));
	 WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
	 userIdField.sendKeys("HD5857");
	 PasswordField.sendKeys("Ajinkya@123");
	 loginButton.click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	 WebElement pinField=driver.findElement(By.id("pin"));
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	 WebElement continueButton=driver.findElement(By.xpath("//button[@type='submit']"));
	 pinField.sendKeys("969696");
	 continueButton.click(); 
	Reporter.log("home page open!!!",true); }
 @AfterMethod
  public void afterMethod() {
	  ShowingId.click();
 Reporter.log("log out",true);}
@AfterClass
  public void afterClass() {
	  driver.close();
  }

}
