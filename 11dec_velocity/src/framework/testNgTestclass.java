package framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ZerothaUsingPOM.POM5ClickonLogo;


public class testNgTestclass extends Base {
	POM1zerothaLogInPage page1 	;POM2zerothaPinPage page2;POM3homepage page3;POM4newUser page4;POM5ClickonLogo page5;

	@BeforeClass
	
  public void browser() {
//		Reporter.log("chromebrowser  open",true);
//		Browser("chrome");
		Reporter.log("firefoxbowser  open",true);
		Browser("firefox");
 page1=new POM1zerothaLogInPage(driver);
 page2=new POM2zerothaPinPage(driver);
 page3=new POM3homepage(driver);
 page4=new POM4newUser(driver);
 page5= new POM5ClickonLogo(driver);
 //Reporter.log("chromebrowser open successfull",true);
 Reporter.log("firefoxbrowser open successfull",true);
  }
@BeforeMethod
public void login() throws EncryptedDocumentException, IOException, InterruptedException {
	Thread.sleep(1000);
page1.enterUserId(Utility.getdatafromexcel(1, 0));
page1.enterPassword(Utility.getdatafromexcel(1, 1));
page1.enterSubmitButton();
Thread.sleep(2000);
page2.enterPin(Utility.getdatafromexcel(1,2));
page2.submitbutton();}
@Test
public void  validationid() throws EncryptedDocumentException, IOException, InterruptedException {
	Thread.sleep(2000);
String actualresult = page3.POM3homepage();
String expectedresult = Utility.getdatafromexcel(1, 0);
	Assert.assertEquals(actualresult, expectedresult,"no matchingg data!!!!");
	Reporter.log("test case pass valid userid!!!!!!!!",true);
	}
@Test
public void watchlist() throws InterruptedException {
	Thread.sleep(2000);
	page3.clickOnWatchlist("TCS");
	
	
	
}
@AfterMethod
public void logout() {
	
	page3.clickOnShowingId();
	page3.clickOnlogOutButton();
	page4.clickOnChangeUser();
	page5.logo();
	
}
  @AfterClass
 public void close()
  {
  driver.close();
 }
  
}
