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

public class pop_up_handle {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
         WebElement popup = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
 boolean popdisplay=popup.isDisplayed();
File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String scr1=RandomString.make(2);
File scr2 =new File("D:\\Seleniumscreenshot\\popupimg"+scr1+".png");
FileHandler.copy(scr, scr2);
if(popdisplay) {
System.out.println("pop up display");
 popup.click();
   }
else {
   System.out.println("pop up not display"); }
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
File img= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String img2=RandomString.make(2);
Thread.sleep(400);
File img3 =new File("D:\\Seleniumscreenshot\\mobileimg"+img2+".png");
FileHandler.copy(img,img3);







	}

}
