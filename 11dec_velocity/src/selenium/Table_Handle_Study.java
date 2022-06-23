package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Handle_Study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://vctcpune.com/");
driver.manage().window().maximize();
Thread.sleep(200);

driver.navigate().to("https://vctcpune.com/selenium/practice.html");
Thread.sleep(200);

 int columnsize = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th")).size();
System.out.println(" total column present " +columnsize);
 


 int rowsize = driver.findElements(By.xpath("//table[@id='product']//tr")).size();
 System.out.println("total row"+ rowsize);

 for (int i=1;i<=rowsize;i++) {
	 for (int j=1;j<=columnsize;j++)
	{String text;
if (i==1) {
	 text = driver.findElement(By.xpath("((//table[@id='product']//tr)["+i+"]//th)["+j+"]")).getText();
System.out.print(text+"-->");


}else {
	text = driver.findElement(By.xpath("((//table[@id='product']//tr)["+i+"]//td)["+j+"]")).getText();
	System.out.print(text+"-->");
}
 }System.out.println();
 }







		
		
		
		
		
		
	}

}
