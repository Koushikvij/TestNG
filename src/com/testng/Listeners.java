package com.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//iTestListener interface is used to implement TestNG listeners

public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Successfully executed listeners after test - "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test Listener after test - "+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
	}
}
