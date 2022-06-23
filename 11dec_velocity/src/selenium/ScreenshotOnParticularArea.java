package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOnParticularArea {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");  Thread.sleep(200); driver.manage().window().maximize();  Thread.sleep(200);
		driver.navigate().refresh();
		
		WebElement path = driver.findElement(By.xpath("//div[@class=\"fauxcolumn-outer fauxcolumn-right-outer\"]"));
		
		File source=((TakesScreenshot)path).getScreenshotAs(OutputType.FILE);
		 System.out.println(source);
		 File dest= new File("D:\\Seleniumscreenshot\\particularpoint.png");
		 FileHandler.copy(source, dest);

		
		
		
		
	}

}
