package Testng_keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Methods {
	@Test (groups="sanity")
	  public void s1() {
		  Reporter.log("i am s1 ",true);
}
	  @Test
	  public void s2() {
		  Reporter.log("i am s2 ",true);
		  
		  
	  }@Test(timeOut =200)
	  public void s3() throws InterruptedException {
		  Thread.sleep(300);
		  Reporter.log("i am s3 ",true);
		  
		  
	  }@Test(groups={"sanity","smoke"})
	  public void s4() {
		  Reporter.log("i am s4 ",true);
		  
		  
	  }
}
