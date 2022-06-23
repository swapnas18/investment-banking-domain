package project;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest extends ZBaseClass {
	Pom1logIN page1;pom2pin page2;pom3home page3;
 @BeforeClass
	public void browserlounch() throws EncryptedDocumentException, IOException, InterruptedException {
	browserlounch("chrome");
	page1=new Pom1logIN(driver);
	page2=new pom2pin(driver);
	page3=new pom3home(driver);
	Reporter.log("browser open successfully!!",true);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));}
@BeforeMethod
public void login() throws EncryptedDocumentException, IOException, InterruptedException {
page1.id(ZUtility.ExternalFile(1, 0));
page1.Verifypass(ZUtility.ExternalFile(1, 1));
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
page2.enterPinAndSubmit(ZUtility.ExternalFile(1, 2));  
 }
@Test
public void Allmodule() {
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	page3.modules();
	
	 
}
//  @Test
//  public void validatedata() throws EncryptedDocumentException, IOException {
//	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//	  page3.hometitlename();
//	  page3.homeuserid(Utility.ExternalFile(1, 0));
//	  Reporter.log("Homepage userid is matching...test casepass!!!",true);
//  }
 

  @AfterMethod
  public void afterMethod() {
  }

 

  @AfterClass
  public void afterClass() {
//	  driver.close();
  }

}
