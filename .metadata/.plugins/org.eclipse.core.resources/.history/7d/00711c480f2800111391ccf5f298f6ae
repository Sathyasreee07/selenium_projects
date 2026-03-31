package Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.sleniumuiframework.generic_utility.FileUtility;
import com.orangehrm.sleniumuiframework.generic_utility.WebDriverUtility;
import com.orangehrm.sleniumuiframework.object_repository.LoginPage;

public class LoginTest {
	@Test
	public void login() throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/login_report.html");
		
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Login Test");
		
		WebDriver driver =new ChromeDriver();
		WebDriverUtility wu=new WebDriverUtility(driver);
		FileUtility fu=new FileUtility();
		LoginPage lp=new LoginPage(driver);
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		
		String urlPath=fu.getPropertKeyValue("url");
		String un=fu.getPropertKeyValue("username");
		String pass=fu.getPropertKeyValue("password");
		
		//Navigate to application
		wu.navigateToApplication(urlPath);
		
		
		//test.log(Status.INFO,"Navigated to OrangeHRM login page");
		test.info("Navigated to OrangeHRM login page");
		lp.login(un, pass);
//		test.log(Status.PASS, "Login Sucessfull");
		test.pass("Login Sucessfull");
		extent.flush();
		
	}

}
