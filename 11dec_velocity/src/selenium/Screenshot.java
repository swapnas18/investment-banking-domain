package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.flipkart.com/");
 driver.manage().window().maximize();
 Thread.sleep(2000);
 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 System.out.println(source);
 File dest= new File("D:\\Seleniumscreenshot\\fbimage.png");
 FileHandler.copy(source, dest);

	}

}
