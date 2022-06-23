package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindTotalLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://demoqa.com/select-menu");
		  driver.manage().window().maximize();
Thread.sleep(300);
		 JavascriptExecutor scroll = (JavascriptExecutor)driver;
		  scroll.executeScript("window,scrollBy(0,500)");
		  Thread.sleep(300);
//		  List<WebElement> totallink = driver.findElements(By.xpath("//li"));
//		  System.out.println("Total link  "+totallink);
//		  for(WebElement o:totallink) {
//System.out.println(o);
		  
List<WebElement> selectcars = driver.findElements(By.xpath("//select[@id='cars']//option"));
System.out.println(selectcars.size());
for (WebElement w:selectcars) {
	System.out.println(w.getText());
	Thread.sleep(200);
	w.click();
	Thread.sleep(200);
	w.click()
;	}
}}
