package com.orangehrm.sleniumuiframework.generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orangehrm.sleniumuiframework.object_repository.LogOutPage;
import com.orangehrm.sleniumuiframework.object_repository.LoginPage;

@Listeners(com.orangehrm.sleniumuiframework.generic_utility.ListenersImplemention.class)
public class BaseClass {
	public WebDriver driver;
	public FileInputStream fis;
	public Properties prop;
	public FileUtility fiu;
	public WebDriverUtility wdu;
	public LogOutPage lop;

	LoginPage lp;
	
	@BeforeSuite
	public void beforesuit() {
		Reporter.log("--Executing Before suit--",true);
	}
	@BeforeTest
    public void beforTest() {
		Reporter.log("--Executing Before test--",true);
	}

	@Parameters("BROWSER")
	
	@BeforeClass(groups= {"Regression","Smoke"})
	 public void beforeClass() throws IOException {
		Reporter.log("--Executing Before class--",true);
		fiu=new FileUtility();

		String browser=fiu.getPropertKeyValue("browser");
		if(browser.contains("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.contains("chrome"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browser.contains("edge"))
		{
			driver=new EdgeDriver();
			
		}
		wdu=new WebDriverUtility(driver);
		lp=new LoginPage(driver);
		lop=new LogOutPage(driver);
		wdu.configMaximizedBrowser();
		wdu.waitForElementsToLoad(30);

		
	}
	@BeforeMethod
	public void beforeMethod() throws IOException {
		Reporter.log("--Executing Before method--",true);
		String URL=fiu.getPropertKeyValue("url");
		String validUserName=fiu.getPropertKeyValue("username");
		String validPassword=fiu.getPropertKeyValue("password");
		
		//login
		wdu.navigateToApplication(URL);
		
		lp.login(validUserName, validPassword);
	}
	
	
	@AfterMethod
	public void configAftermethod() {
		Reporter.log("--Executing After method--",true);
		lop=new LogOutPage(driver);
		lop.logout();
	}
	
	@AfterClass
	public void configAfterClass() {
		Reporter.log("--Executing After class--",true);
	    wdu.closingBrowserWindow();
	}
	
	@AfterTest
	public void configAfterTest() {
		Reporter.log("--Executing After test--",true);
	}
	
	@AfterSuite
	public void configAfterSuite() {
		Reporter.log("--Executing After suit--",true);
	}
	
}
