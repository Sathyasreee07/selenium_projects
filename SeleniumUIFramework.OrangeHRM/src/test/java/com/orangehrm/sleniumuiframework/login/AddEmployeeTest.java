package com.orangehrm.sleniumuiframework.login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.orangehrm.sleniumuiframework.object_repository.AddEmployeePage;
import com.orangehrm.sleniumuiframework.object_repository.DashboardPage;
import com.orangehrm.sleniumuiframework.object_repository.LoginPage;
import com.orangehrm.sleniumuiframework.object_repository.PIMPage;

public class AddEmployeeTest {
	WebDriver driver;
	
	@Test
	private void addNewEmployee() throws InterruptedException {
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		options.addArguments("--incognito");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		DashboardPage dbp=new DashboardPage(driver);
		PIMPage pim=new PIMPage(driver);
		AddEmployeePage aemp=new AddEmployeePage(driver);
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Login
	    lp.login("Admin","admin123");
	   

		dbp.clickPimLink();
		
	//	pim.clickAddButton();
		//add emp
		wait.until(ExpectedConditions.elementToBeClickable(aemp.getToggleBtn()));
		aemp.addEmployee("Abcde", "ef", "gh", "31");
		//after toggle
		wait.until(ExpectedConditions.visibilityOf(aemp.getUserName()));
		aemp.enterCredential("abced", "Password@123");
		
		
	}
}

