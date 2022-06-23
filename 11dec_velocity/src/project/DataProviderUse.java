package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class DataProviderUse  extends ZBaseClass{
	Pom1logIN page1;pom2pin page2;pom3home page3; String uid ;String pass;String pin;
	String Status;
	@BeforeClass
	  public void beforeClass() {
		 browserlounch("chrome");
		 page1= new Pom1logIN(driver);
		 page2=new pom2pin(driver);
			page3=new pom3home(driver);
			Reporter.log("browser open successfully!!",true);  }
			 
			
	  @Test(dataProvider = "Data")
  public void validateData(String uid,String pass,String pin) throws InterruptedException {
		  page1.id(uid);
		  page1.Verifypass(pass);
		  
    
  }
  
 
	  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider(name="Data")
  public String []getDataFr0mExcel() throws EncryptedDocumentException, IOException {
	  FileInputStream Myfile = new FileInputStream("D:\\Excel_Study\\Excel_test1.xlsx");
		Sheet excelsheet = WorkbookFactory.create(Myfile).getSheet("zerothawithddf");
		String [] data= new String[3];
		data[0]=excelsheet.getRow(1).getCell(0).getStringCellValue();
		data[1]=excelsheet.getRow(1).getCell(1).getStringCellValue();
		data[2]=excelsheet.getRow(1).getCell(2).getStringCellValue();
		
		return data;
		}}
//			    
//			
// }
// 
//
//  @AfterClass
//  public void afterClass() {
//  }
//
////}
//	Pom1logIN page1;
//	pom2pin page2;
//	pom3home page3;
//	ZUtility U;
//	 Sheet MySheet;
//	 String id;
//	@BeforeClass
//	public void browserlounch1() throws EncryptedDocumentException, IOException, InterruptedException {
//	      browserlounch("Chrome");
//			
//	page1=new Pom1logIN(driver);
//	page2=new pom2pin(driver);
//	page3=new pom3home(driver);
// 
//     U=new ZUtility();
//	 id =ZUtility.ExternalFile(1, 0); 
//      String pass = ZUtility.ExternalFile(1, 1);
//       String pin =ZUtility.ExternalFile(1, 2);
//	  System.out.println(id); System.out.println(pass); System.out.println(pin);
//       page1.id(id);
//	 page1.Verifypass(pass);
//	 Thread.sleep(1000);
//	page2.enterPinAndSubmit(pin); }
//  @Test
//  public void validatedata() throws EncryptedDocumentException, IOException  {
//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//	  page3.hometitlename();
//	  page3.homeuserid(id);
//	
//	  Reporter.log("Homepage userid is matching...test casepass!!!",true); }
// @Test
// public void Allmodule() {
//	page3.modules();	
// }@AfterClass
// public void logout() throws InterruptedException{
//	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//	// page3.logout();
//	 
//	 
// }
//
// 
//
//}

	
