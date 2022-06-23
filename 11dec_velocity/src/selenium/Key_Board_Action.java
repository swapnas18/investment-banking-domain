package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_Board_Action {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
 driver.get("https://www.facebook.com/");  Thread.sleep(200);
  driver.manage().window().maximize();  Thread.sleep(200);
 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();Thread.sleep(2000);
WebElement DateButton = driver.findElement(By.name("birthday_day"));
 Actions act=new Actions(driver);Thread.sleep(200);
act.click(DateButton).perform();
// 
// 
//for(int i=0;i<=4;i++) {
//	 act.sendKeys(Keys.ARROW_UP).perform(); Thread.sleep(100);}
// for(int i=0;i<=16;i++) {
// act.sendKeys(Keys.ARROW_DOWN).perform();Thread.sleep(100);
//		 }
// act.sendKeys(Keys.ENTER).perform();
// Thread.sleep(200);
//  WebElement month=driver.findElement(By.id("month"));
//  for(int i=0;i<=5;i++) {
//  act.click(month).sendKeys(Keys.ARROW_DOWN).perform();Thread.sleep(100);}	 
//	 
//  WebElement year=driver.findElement(By.id("year"));
//  for(int i=0;i<=23;i++) {
//  act.click(year).sendKeys(Keys.ARROW_DOWN).perform();Thread.sleep(100);}	 
	WebElement copy = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div[1]/div[1]")) ;
	WebElement paste = driver.findElement(By.name("firstname"));
 act.moveToElement(copy).doubleClick().click().keyDown(Keys.CONTROL).sendKeys("c"). 
 moveToElement(paste).click().sendKeys("v").keyUp(Keys.CONTROL).build().perform();


}}
