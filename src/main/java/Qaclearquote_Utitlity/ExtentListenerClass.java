package Qaclearquote_Utitlity;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListenerClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test Execute Sucessfully");
	
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getName()+"Test Fail");
	
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"Test Skipped");
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName()+"Test Fail in %");
	
	}


	public void onStart(ITestContext context) {
		System.out.println(context.getName()+"Started");
		System.out.println(context.getName()+"Started");
	
	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+"Finished");
		
	}
	
}

	
	
	
