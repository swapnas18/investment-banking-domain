package SStestClass;

import org.testng.annotations.Test;

import SSPOMClasses.homepage;
import SSPOMClasses.loginkite;
import SSPOMClasses.pinpage;
import SSUility.utility_using_propertiesFile;
import SSbasepackage.BaseusingpropertiesFile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
@Listeners(SSlistner.listner.class)
public class NewTest extends BaseusingpropertiesFile{
	loginkite page1;pinpage page2;homepage page3;
@BeforeClass
	  public void beforeClass() throws IOException {
		Browser("chrome");
		 page1=new  loginkite(driver);
		 page2=new pinpage(driver);
		 page3=new homepage(driver);
		 System.out.println(utility_using_propertiesFile.getData("ids"));
		 }
@BeforeMethod
	  public void beforeMethod() throws IOException, InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	page1.id(utility_using_propertiesFile.getData("ids")); 
	page1.Verifypass(utility_using_propertiesFile.getData("passs"));	 
	page1.submit();
    Thread.sleep(1000);
	page2.enterPin(utility_using_propertiesFile.getData("pins"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
	page2.sub();}
@Test
public void idcheck() throws IOException {
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	String act=page3.homeuserid();
	System.out.println(act);
	String Expected=utility_using_propertiesFile.getData("ids");
	Assert.assertEquals(act, Expected);
	
	Reporter.log("id is matchingg!!!!",true);
}
  
  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {
	  if(result.isSuccess()) {
		  Reporter.log("test case pass!!!");
	  }
	  else {
		  utility_using_propertiesFile.screenshot(driver, 200);
	  }
	  
	  
	  
	  
	  page3.homeuserid();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  
	  page3.logout();
  }

 

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
