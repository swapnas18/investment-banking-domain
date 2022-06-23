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
import framework.Utility;

public class ErrorIdMsg  extends Base{
	
	
	loginkite page1;
	@BeforeClass
	public void lounchbrowser() {
		Browser("chrome");
		
		page1= new loginkite (driver);
		
}
	@BeforeMethod
	public void enterId() throws EncryptedDocumentException, IOException, InterruptedException {
	 page1.id(utility.FetchDatafromfile(1, 0));
	  page1.submit();
	}
	
	
  @Test
  public void msgOfWrongPass () throws EncryptedDocumentException, IOException {
String actual = page1.errorpassmsg();
  String expected =(utility.FetchDatafromfile(1, 5));
  Assert.assertEquals(actual, expected ," error msg of wrong password match");
  Reporter.log("Error msg match for incorrectpass",true);
  }
}
