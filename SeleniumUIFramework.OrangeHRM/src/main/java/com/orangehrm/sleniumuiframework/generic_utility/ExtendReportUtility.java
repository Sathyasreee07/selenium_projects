package com.orangehrm.sleniumuiframework.generic_utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	public static ExtentReports extent;
	public static void ExtentInstance() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/test_reports.html");
		//ReporterConfiguratio
		spark.config().setReportName("OrangeHRM UI Automation Report");
		spark.config().setDocumentTitle("Test Results");
		extent=new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Automoation Tester", "Rashab Patel");
		extent.setSystemInfo("Ui_Automation_Framework", "Selenium+TestNG");
		
		
		
	}
}
