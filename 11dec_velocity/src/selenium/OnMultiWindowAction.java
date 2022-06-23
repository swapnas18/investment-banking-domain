package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class OnMultiWindowAction {
// we have two window select text from second window and paste it into third page
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://skpatro.github.io/demo/links/");
		 driver.manage().window().maximize();
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//*[@id=\"regform\"]/div[2]/a/input"));
      driver.findElement(By.name("NewWindow")).click();
		Set<String>	handlewindow=driver.getWindowHandles();
            Iterator<String> it = handlewindow.iterator();
            String parent=it.next();
            String child=it.next();
            driver.switchTo().window(child);
            driver.manage().window().maximize();
            Thread.sleep(500);
            WebElement FromSecondWindowGetText = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
            FromSecondWindowGetText.sendKeys("GoodMorningHaveAGoodDay");
            Thread.sleep(500);
            Actions act = new Actions(driver);
            act.moveToElement(FromSecondWindowGetText).doubleClick().build().perform(); 
            FromSecondWindowGetText.sendKeys(Keys.chord(Keys.CONTROL,"c"));
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]")).click();
            Thread.sleep(500);
            WebElement ThirdPage = driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/div[2]/div"));
            ThirdPage.click();
            WebElement PasteHere = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
            Thread.sleep(1000);
           PasteHere.sendKeys(Keys.chord(Keys.CONTROL,"v"));
            Thread.sleep(500);
            
	}}       