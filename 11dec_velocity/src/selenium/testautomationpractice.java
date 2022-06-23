package selenium;

import java.awt.Dimension;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Argument;

public class testautomationpractice {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");  Thread.sleep(200); driver.manage().window().maximize();  Thread.sleep(200);
driver.navigate().refresh();
driver.switchTo().frame("frame-one1434677811");Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("sapna");Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("shinde");Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='RESULT_TextField-3']")).sendKeys("7676768732");Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='RESULT_TextField-4']")).sendKeys("INDIA");Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='RESULT_TextField-5']")).sendKeys("solapur");Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@name='RESULT_TextField-6']")).sendKeys("sapna99@gmail.com");Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[2]/td/label")).click(); Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label")).click() ;Thread.sleep(500);
	driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_1']")).click() ;Thread.sleep(500);
	WebElement besttime = driver.findElement(By.id("RESULT_RadioButton-9"));
Select contact=new Select(besttime);
besttime.click();
contact.selectByValue("Radio-2");Thread.sleep(500);
driver.switchTo().defaultContent();Thread.sleep(2000);

 WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
 Actions act=new Actions (driver);
 act.doubleClick(doubleclick).perform();
 act.moveToElement(doubleclick).doubleClick().build().perform()
; WebElement drop = driver.findElement(By.id("droppable"));
        WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));Thread.sleep(2000)
;        act.dragAndDrop(drag,drop).perform();
        
 
WebElement mj_drag = driver.findElement(By.xpath("//h5[text()='Mr John']"));
WebElement mj_drop = driver.findElement(By.id("trash"));
act.clickAndHold(mj_drag).moveToElement(mj_drop).release().build().perform()
;	Thread.sleep(1000);
WebElement marry_drag = driver.findElement(By.xpath("//h5[text()='Mary']"));

act.clickAndHold(marry_drag).moveToElement(mj_drop).release().build().perform();

   WebElement size_change = driver.findElement(By.id("resizable"));
System.out.println(size_change.getSize()); Thread.sleep(1000);
 Dimension dm=new Dimension();
dm.setSize(400, 400);
System.out.println(dm.getSize());

     driver.findElement(By.xpath("//button[text()='Click Me']")).click();


     Alert alt =  driver.switchTo().alert();
     alt.dismiss();	
	
	WebElement date = driver.findElement(By.id("datepicker"));
	date.sendKeys("18/09/98");
	Thread.sleep(1000);
act.sendKeys(Keys.ENTER).build().perform()
;	WebElement speeddrop = driver.findElement(By.id("speed"));
	speeddrop.click();	
	Select s= new Select(speeddrop);
s.selectByVisibleText("Medium");
WebElement fileselect = driver.findElement(By.id("files"));
fileselect.click();	speeddrop.click();	
Select f= new Select(fileselect);
f.selectByVisibleText("Other file");
 //driver.close();
speeddrop.click();	
	JavascriptExecutor scrol = (JavascriptExecutor)driver;
       // scrol.executeScript("window.scrollBy(100//,2000)");  
WebElement home= driver.findElement(By.xpath("//a[text()='Home']"));
 Thread.sleep(2000);

scrol.executeScript("arguments[0].scrollIntoView(true);",home);
	driver.close();

	}
}
