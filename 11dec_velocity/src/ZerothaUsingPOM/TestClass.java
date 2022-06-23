package ZerothaUsingPOM;

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
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");

		
		 WebDriver driver= new ChromeDriver();
		 
  driver.get("https://kite.zerodha.com/");  Thread.sleep(200);
  driver.manage().window().maximize();
	 Thread.sleep(1000);	
	
	 FileInputStream Myfile = new FileInputStream("D:\\Excel_Study\\Excel_test1.xlsx");
		Sheet zerothasheet = WorkbookFactory.create(Myfile).getSheet("zerothawithddf");
		int totalRow = zerothasheet.getLastRowNum();
		
	for (int i=1;i<=totalRow;i++) {
		String myuserid = zerothasheet.getRow(i).getCell(0).getStringCellValue();
		String mypassword = zerothasheet.getRow(i).getCell(1).getStringCellValue();
		String mypin =  zerothasheet.getRow(i).getCell(2).getStringCellValue();
		
		POM1zerothaLogInPage login = new POM1zerothaLogInPage(driver);
		login.enterUserId(myuserid);
		login.enterPassword(mypassword);
		login.enterSubmitButton();
	Thread.sleep(1000);
		POM2zerothaPinPage pin= new POM2zerothaPinPage(driver);
		pin.enterPin(mypin);
		pin.submitbutton();
		 Thread.sleep(2000);

		Thread.sleep(2000);
		POM3homepage home =new POM3homepage(driver);
		home.idfromhomepage(myuserid);
		
		
		Thread.sleep(2000);
		home.clickOnShowingId() ;
		Thread.sleep(1000);
		home.clickOnlogOutButton();
		Thread.sleep(1000);
POM4newUser newUser=new POM4newUser(driver);
newUser.clickOnChangeUser();
Thread.sleep(1000);

POM5ClickonLogo logoclick=new POM5ClickonLogo(driver);
logoclick.logo();
Thread.sleep(1000);
	}
		driver.close() ;
	}

}
