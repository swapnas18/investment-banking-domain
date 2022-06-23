package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://demoqa.com/nestedframes");  Thread.sleep(200);
		  driver.manage().window().maximize();  Thread.sleep(200);
  driver.switchTo().frame("frame1"); Thread.sleep(200);
   WebElement parent = driver.findElement(By.xpath("//body[text()='Parent frame']"));
	
	String actualresult=parent.getText();
	String expectedresult="Parent frame";
	if(actualresult.equals(expectedresult)) {
		System.out.println("text  "+ expectedresult);
	}else {
		System.out.println(" text case fail");
	}
	Thread.sleep(200);
	WebElement frame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	driver.switchTo().frame(frame);
	Thread.sleep(200);
	WebElement child = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
	String actualname=child.getText();
	
	String expectedname="Child Iframe";
	if(actualname.equals(expectedname)){
	System.out.println(" text "+ expectedname);

	}else {
		System.out.println("test case fail" );
	}
	
	

}}
