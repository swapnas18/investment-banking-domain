package TEStNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jdk.javadoc.doclet.Reporter;

public class MyClass {
  @Test
  public void method1() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/login.html");
		 
		  driver.manage().window().maximize();
		}
 @Test
  public void method2() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver= new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 	  driver.manage().window().maximize();
}
  @Test
  public void method3() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
		 driver.get("https://demoqa.com/select-menu");
		 	  driver.manage().window().maximize();
		 ;}
  @Test
  public void method4() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		  driver.manage().window().maximize();}
 
}
