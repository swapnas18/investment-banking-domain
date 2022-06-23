package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class syntax {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("9960250876");

	driver.findElement(By.name("pass")).sendKeys("Dipa@123");
	Thread.sleep(500);
	driver.findElement(By.name("login")).click();
	driver.manage().window().maximize();
	Thread.sleep(500);
	driver.findElement(By.linkText("Dipali Gawade")).click();
	Thread.sleep(500);
	//driver.findElement(By.xpath("//*[@id=\"mount_0_0_Tp\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/a[2]/div[1]")).click();
//String MainPage = driver.getCurrentUrl();
//if (MainPage.equals("https://www.facebook.com/dipali.gawade.37266")) {
 WebElement cookiesButton = driver.findElement(By.xpath("//a[text()='Cookies']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true);",cookiesButton);
Thread.sleep(500);

}}
