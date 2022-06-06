package listener;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class testngListnerMethod implements ITestListener{


	public void onTestStart(ITestResult result) {
		System.out.println("TestCases Started and details are " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases Succes Hureeyy and TestCase details are " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("ohhh Shit !!! TestCases failed and TestCase details are " + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases Skipped and TestCase details are " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		
	}
	
	
	public void onStart(ITestContext context) {
		System.out.println("Testing Started and Testing details are " + context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Testing Finished and Testing details are " + context.getName());
		
	}
	
}
