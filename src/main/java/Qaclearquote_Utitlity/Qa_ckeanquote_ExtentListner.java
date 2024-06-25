package Qaclearquote_Utitlity;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentListenerClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test Execute Sucessfully");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getName()+"Test Fail");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"Test Skipped");
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName()+"Test Fail in %");
	
	}


	@Override

	public void onStart(ITestContext context) {
		System.out.println(context.getName()+"Started");
		System.out.println(context.getName()+"Started");
	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+"Finished");
		
	}
	


	
	
	
