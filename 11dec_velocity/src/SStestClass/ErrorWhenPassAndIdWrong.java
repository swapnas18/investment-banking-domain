package SStestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SSPOMClasses.loginkite;
import SSUility.utility;
import SSbasepackage.Base;

public class ErrorWhenPassAndIdWrong extends Base {
	
	loginkite page1;
	@BeforeClass
	public void lounchbrowser() {
		Browser("chrome");
		
		page1= new loginkite (driver);
		
}
	@BeforeMethod
	public void enterPassword() throws EncryptedDocumentException, IOException, InterruptedException {
	 page1.id(utility.FetchDatafromfile(4, 0));
		page1.Verifypass(utility.FetchDatafromfile(4, 1));
		
	  page1.submit();
		}
	
 @Test
  public void passwordErrormsg() throws EncryptedDocumentException, IOException {
 String actual = page1.uiandpasswrong();
 System.out.println(actual);
 String Expected=utility.FetchDatafromfile(4, 4);
 System.out.println(Expected);
            Assert.assertEquals(actual, Expected,"error msg no matching");      
            Reporter.log("Error msg is match",true);
 
 
 }
 @AfterClass
 public void closebrowser() throws InterruptedException {
	 Thread.sleep(1000);
	 Browerclose() ;
 }
}
