package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class revise_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		String str= RandomString.make(3);
		File  dest=new File("D:\\Seleniumscreenshot\\zomato"+str+".png");
		FileHandler.copy(source, dest);
	Thread.sleep(1000);driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[3]/input")).sendKeys("pizza");
		Thread.sleep(1000);
		File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source1);
		String str1= RandomString.make(3);
		File  dest1=new File("D:\\Seleniumscreenshot\\zomato"+str1+".png");
		FileHandler.copy(source1, dest1);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[3]/input")).click();
		Thread.sleep(1000);
		File source2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source2);
		String str2= RandomString.make(3);
		File  dest2=new File("D:\\Seleniumscreenshot\\zomato"+str2+".png");
		FileHandler.copy(source2, dest2);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[3]/div[2]/div/div[1]/img")).click();
		Thread.sleep(500);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//	driver.findElement(By.xpath("//*[@id=\"navigation_cl03ytb0l0000396zltmbgeo0\"]/li[4]/a")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"id-83\"]/section[2]/section/div[1]/section/labell")).sendKeys("sapna");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//	driver.switchTo().frame("/html/body/noscript[1]/text()")
		
		
	}

}
