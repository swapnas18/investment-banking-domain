package SSlistner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listener1 implements ITestListener {

	
	@Override
	public void onStart(ITestContext context) {
	Reporter.log("test case pass",true);
		ITestListener.super.onStart(context);
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("test case fail",true);
		ITestListener.super.onTestFailedWithTimeout(result);
	}
}
