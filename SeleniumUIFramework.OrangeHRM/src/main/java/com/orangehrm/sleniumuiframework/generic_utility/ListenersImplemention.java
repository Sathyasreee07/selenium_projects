package com.orangehrm.sleniumuiframework.generic_utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenersImplemention implements ITestListener{
	ExtentReports extent=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/test_result.html");
	ExtentTest test;
	WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("Test Status:Pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail("Test Status : Fail");
		test.fail(result.getThrowable());
		ScreenshotUtility sc=new ScreenshotUtility();
		try {
			sc.captureScreenshot(driver, result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extent.flush();
	}
	
}
