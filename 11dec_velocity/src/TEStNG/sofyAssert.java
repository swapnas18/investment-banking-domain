package TEStNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sofyAssert {
	SoftAssert soft= new SoftAssert();

		 @Test
		  public void TC1() 
		  
		  {
			  String ExpectedResult="VCTC";
			  String ActualResult="VCTC";
			  
			 soft.assertEquals(ExpectedResult,ActualResult);
			  Reporter.log("TC1 is running", true);
			  soft.assertAll();
		  }
		 
		 		 
		 @Test

		 public void TC2() 
		  {
			  String ExpectedResult="VCTC";
			  String ActualResult="VCTC11";
			  soft.assertEquals(ExpectedResult,ActualResult);
			  Reporter.log("TC2 is running", true);
			
		  }
		 
		  @Test
		  public void TC3() 
		  
		  {
			  String ExpectedResult="VCTC";
			  String ActualResult="VCTC1";
			  
			  Assert.assertNotEquals(ActualResult, ExpectedResult, "Result is matching");
			  Reporter.log("TC2 is running", true);
		  }
		  
		 
	}


