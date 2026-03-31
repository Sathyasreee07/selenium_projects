package practice;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DemoBaseClass {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite(Method m1) {
		System.out.println("Executing"+ m1);
	}
	@BeforeTest
    public void bestTest(Method m2) {
		System.out.println("Executing"+ m2);
		
	}
	@BeforeClass
    public void beforeClass(Method m3) {
		System.out.println("Executing"+ m3);
		
	}
	@BeforeMethod
	public void beforeMethod(Method m4) {
		System.out.println("Executing"+ m4);
	}
	@AfterMethod
    public void AfterMethod(Method m5) {
		System.out.println("Executing"+ m5);
		
	}
	@AfterClass
    public void AfterClass(Method m6) {
		System.out.println("Executing"+ m6);
	}
	@AfterTest
    public void AfterTest(Method m7) {
		System.out.println("Executing"+ m7);
		
	}
	@AfterSuite
    public void afterSuite(Method m8) {
		System.out.println("Executing"+ m8);
	}

}
