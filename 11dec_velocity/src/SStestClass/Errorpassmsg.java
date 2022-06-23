package SStestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SSPOMClasses.loginkite;
import SSUility.utility;
import SSbasepackage.Base;


public class Errorpassmsg extends Base {
	loginkite page1;
	@BeforeClass
	public void lounchbrowser() {
		Browser("firefox");
		
		page1= new loginkite (driver);
		
}
	@BeforeMethod
	public void enterPassword() throws EncryptedDocumentException, IOException, InterruptedException {
	 page1.Verifypass(utility.FetchDatafromfile(1, 1));
	  page1.submit();
		
	
	
	}
	
 @Test
  public void passwordErrormsg() throws EncryptedDocumentException, IOException {
		String actual = page1.Erroruseeridmsg();
		String expected = (utility.FetchDatafromfile(1, 4));
		System.out.println(actual);
		System.out.println(expected);
	  Assert.assertEquals(actual, expected,"user error msg not match");
	 Reporter.log("actual and expected result match",true);
  }
 
}

