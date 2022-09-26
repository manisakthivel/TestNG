package com.practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersEx implements ITestListener {

	
	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Started the Project");
	}
	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("End");
		
	}
	@Override
	public void onTestSuccess(ITestResult arg0) {
		 System.out.println("Party");
		
	}
	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Screenshot");
		
	}
	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Hello Welcome");
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("Rerun");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Skipped");
		
	}

	

	

}
