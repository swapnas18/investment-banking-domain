package SStestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SSUility.utility;
import SSUility.utility_using_propertiesFile;
import SSbasepackage.Base;
import project.Pom1logIN;
import project.ZUtility;
import project.pom2pin;
import project.pom3home;
@Listeners(SSlistner.listener1.class)
public class testClass extends Base{
	Pom1logIN page1;pom2pin page2;pom3home page3;
 @BeforeClass
	public void browserlounch() throws EncryptedDocumentException, IOException, InterruptedException {
	Browser("chrome");
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
public void afterMethod(ITestResult result) throws IOException {
	  if(result.isSuccess()) {
		  Reporter.log("test case pass!!!");
	  }
	  else {
		  utility_using_propertiesFile.screenshot(driver, 200);
	  }
	 
	 
	 }
}
