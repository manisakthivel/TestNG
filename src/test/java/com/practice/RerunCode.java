package com.practice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunCode implements IRetryAnalyzer{

	int failedcount = 1 ;
	int limit = 4;
	/*@Override	
	public boolean retry(ITestResult arg0) {
		if(failedcount<limit) {
			failedcount++;
			return true;
		}
		return false;
	}*/
	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
