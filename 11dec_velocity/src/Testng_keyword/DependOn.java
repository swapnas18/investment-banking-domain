package Testng_keyword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOn {
  @Test(groups="sanity")
  public void a1() {
	  Reporter.log("i am a ",true);
	  Assert.fail();
	  
  }
  @Test(groups="regression")
  public void b1() {
	  Reporter.log("i am b ",true);
	  
	  
  }@Test(groups="sanity")
  public void c1() {
	  Reporter.log("i am c ",true);
	  
	  
  }@Test(groups="sanity")
  public void d1() {
	  Reporter.log("i am d ",true);
	  
	  
  }
}
