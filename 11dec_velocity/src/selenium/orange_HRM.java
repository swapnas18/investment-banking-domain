package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class orange_HRM {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");  Thread.sleep(200);
		  driver.manage().window().maximize();  Thread.sleep(200);
		  WebElement usernametextbox = driver.findElement(By.xpath("//*[@id=\"divUsername\"]/span"));
		  WebElement passwordtextbox=  driver.findElement(By.xpath("//*[@id=\"divPassword\"]/span"));
		  boolean userdisplay=usernametextbox.isDisplayed();
		  boolean passdisplay=passwordtextbox.isDisplayed();
		  Thread.sleep(1000);
			File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			String str= RandomString.make(3);
			File  dest=new File("D:\\Seleniumscreenshot\\openurl"+str+".png");
			FileHandler.copy(source, dest);
		  System.out.println(" \ntest case 1");
		  System.out.println(" verify text field name should be display");
		 if(userdisplay) {
			  System.out.println("username text is display=test pass");
		  }else {
			  System.out.println("username text not display=test fail");
		  } 
		 if(passdisplay) {
			  System.out.println("password text is display=test pass");
		  }else {
			  System.out.println("username text not display=test fail");
		  }
		  Thread.sleep(200);
 System.out.println(" \ntest case 2");
 System.out.println(" verify after click on text field ,text is not visible");
		 usernametextbox.click();
		 boolean userdisplay1=usernametextbox.isDisplayed();
		  boolean passdisplay1=passwordtextbox.isDisplayed();
 if(userdisplay1) {
			  System.out.println("username text is display=test fail");}
	  else {
			  System.out.println("username text not display=test pass");
		  }
		 if(passdisplay1) {
		  System.out.println("password text is  display=test fail");
		  }else {
			  System.out.println("password text not display=test pass");
		  }
		 Thread.sleep(1000);
			File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			String str1= RandomString.make(3);
			File  dest1=new File("D:\\Seleniumscreenshot\\textdisplay"+str1+".png");
			FileHandler.copy(source1, dest1);
		  Thread.sleep(200);
		System.out.println("\n TEST CASE 3");
		System.out.println(" verify  user able to enter username and password ");
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		 WebElement Password=  driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		 String U="Admin";
		 Username.sendKeys(U);
		 String P="admin123";
		 Password.sendKeys(P);
		 WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		 Thread.sleep(1000);
			File source2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String str2= RandomString.make(3);
			File  dest2=new File("D:\\Seleniumscreenshot\\input"+str2+".png");
			FileHandler.copy(source2, dest2);
System.out.println(" \n test case 4" );
System.out.println(" verify  user able click on login button");
if (loginbutton.isDisplayed()) {
	System.out.println("login button is display then click the button");
	loginbutton.click();
	}else {
	 System.out.println(" login button not display");
}
System.out.println("\n Test case 5  ");
System.out.println(" verify user able to login  and go to  home page");
		String nextpage="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		//System.out.println(driver.getCurrentUrl());
		
	if (driver.getCurrentUrl().equals(nextpage))
		{
			System.out.println("\nlogin succesfull ");
			System.out.println(" Home page open");
		} else {
			System.out.println("login failed");
		}
		
	Thread.sleep(1000);
	File source3= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String str3= RandomString.make(3);
	File  dest3=new File("D:\\Seleniumscreenshot\\loginsuccesfull"+str3+".png");
	FileHandler.copy(source3, dest3);
	
			 
			 
			 
		 
	}

}
     