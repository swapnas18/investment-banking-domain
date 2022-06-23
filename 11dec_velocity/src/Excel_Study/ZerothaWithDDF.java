package Excel_Study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerothaWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream Myfile = new FileInputStream("D:\\Excel_Study\\Excel_test1.xlsx");
	Sheet zerothasheet = WorkbookFactory.create(Myfile).getSheet("zerothawithddf");



System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://kite.zerodha.com/");  Thread.sleep(200);
driver.manage().window().maximize();
Thread.sleep(1000);


int totalRow = zerothasheet.getLastRowNum();
int totalcell = (zerothasheet.getRow(0).getLastCellNum())-1;

for(int i=1;i<=totalRow;i++) {
	WebElement userIdField = driver.findElement(By.id("userid"));
	String myuserid = zerothasheet.getRow(i).getCell(0).getStringCellValue();
	WebElement PasswordField = driver.findElement(By.id("password"));
String mypassword = zerothasheet.getRow(i).getCell(1).getStringCellValue();
	WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
String mypin =  zerothasheet.getRow(i).getCell(2).getStringCellValue();
userIdField.sendKeys(myuserid);
PasswordField.sendKeys(mypassword);
loginButton.click();
Thread.sleep(3000);
WebElement pinField=driver.findElement(By.xpath("//input[@type='password']"));
pinField.sendKeys(mypin);
WebElement continueButton=driver.findElement(By.xpath("//button[@type='submit']"));
 continueButton.click(); 
 Thread.sleep(1000);
 WebElement ShowingId = driver.findElement(By.xpath("//span[@class='user-id']"));
 String actualResult = ShowingId.getText();
 String expectedResult =myuserid;
  if(actualResult.equals(expectedResult)) {
 System.out.println("Welcome  log in succesfull----->test case pass");
 Thread.sleep(1000);
 	ShowingId.click();
 	driver.findElement(By.xpath("//a[@target='_self']")).click();
 	Thread.sleep(2000);
 	System.out.println("  log out succesfull");
 	 Thread.sleep(1000);
 	 driver.findElement(By.xpath("//a[text()='Change user']")).click(); 
 	 Thread.sleep(1000); 
  driver.findElement(By.xpath("//a[@class='logo kite-logo']")).click();
  System.out.println("test data " +i+ "done");
  
  }
  
}//driver.close();
System.out.println("ALL TEST DATA PASS");


	}

}
