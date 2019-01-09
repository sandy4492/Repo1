package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerInTestNG implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("All test finished");
		Reporter.log("All test finished");

	}

	public void onStart(ITestContext arg0) {

		System.out.println("All test Started");
		Reporter.log("All test finished");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

		System.out.println("Test finished based on % " + methodName(arg0));
		Reporter.log("Test finished based on % " + methodName(arg0));
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test Failed " + methodName(arg0));
		Reporter.log("Test Failed " + methodName(arg0));

	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test skipped " + methodName(arg0));
		Reporter.log("Test skipped " + methodName(arg0));
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Starting Test is " + methodName(arg0));
		Reporter.log("Starting Test is " + methodName(arg0));

	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test Passed" + methodName(arg0));
		Reporter.log("Test Passed" + methodName(arg0));

	}

	public static String methodName(ITestResult arg0) {

		return arg0.getMethod().getConstructorOrMethod().getName();
		

	}
}
