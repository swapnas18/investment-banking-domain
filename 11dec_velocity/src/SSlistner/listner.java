package SSlistner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listner  implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("open succesfull!!!!",true);
		ITestListener.super.onStart(context);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(" test succesfull!!!!",true);
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("test failed!!!!",true);
		ITestListener.super.onTestFailure(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("test skipppp!!!!",true);
		ITestListener.super.onTestSkipped(result);
	}
@Override
public void onFinish(ITestContext context) {
	Reporter.log("test finishhhhhhhh!!!!",true);
	ITestListener.super.onFinish(context);
}
}
