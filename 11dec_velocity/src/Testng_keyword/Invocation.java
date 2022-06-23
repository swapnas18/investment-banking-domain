package Testng_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	  @Test (groups="sanity")
	  public void a() {
		  Reporter.log("i am a ",true);
 }
	  @Test
	  public void b() {
		  Reporter.log("i am b ",true);
		  
		  
	  }@Test
	  public void c() {
		  Reporter.log("i am c ",true);
		  
		  
	  }@Test(groups={"sanity","Smoke"})
	  public void d() {
		  Reporter.log("i am d ",true);
		  
		  
	  }
}
