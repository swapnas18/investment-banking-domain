package ZerothaUsingPOM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng {
	WebDriver driver;
	Sheet zerothasheet;String myuserid;
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://kite.zerodha.com/");  
	driver.manage().window().maximize();
    FileInputStream Myfile = new FileInputStream("D:\\Excel_Study\\Excel_test1.xlsx");
    zerothasheet = WorkbookFactory.create(Myfile).getSheet("zerothawithddf");
	}
	@Test
	public void loginPage() throws IOException {
		
		myuserid = zerothasheet.getRow(1).getCell(0).getStringCellValue();
		String mypassword = zerothasheet.getRow(1).getCell(1).getStringCellValue();
		POM1zerothaLogInPage login = new POM1zerothaLogInPage(driver);
		login.enterUserId(myuserid);
		login.enterPassword(mypassword);
		login.enterSubmitButton();
		Snapshot.shot(driver);
		Reporter.log("log in successfull!!!!",true);
	}
   @Test(priority=1)
   public void pinPage() throws InterruptedException, IOException {
	 String mypin =  zerothasheet.getRow(1).getCell(2).getStringCellValue();
	  POM2zerothaPinPage pin= new POM2zerothaPinPage(driver);
	  Thread.sleep(4000);
	  pin.enterPin(mypin);
 pin.submitbutton();Snapshot.shot(driver);
 Reporter.log("pin added successfull!!!!",true);
}
   @Test(priority=2)
   public void homepage() throws IOException {
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	   POM3homepage home =new POM3homepage(driver);
		home.idfromhomepage(myuserid);
		home.clickOnShowingId() ;Snapshot.shot(driver);
		home.clickOnlogOutButton();
		 Reporter.log("log out  successfull!!!!",true);
 }

   
   
	
	
 

}
