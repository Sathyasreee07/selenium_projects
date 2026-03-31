package Demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.sleniumuiframework.generic_utility.ScreenshotUtility;
import com.orangehrm.sleniumuiframework.generic_utility.WebDriverUtility;
import com.orangehrm.sleniumuiframework.object_repository.DashboardPage;
import com.orangehrm.sleniumuiframework.object_repository.LoginPage;

public class CaptureScreenshot {
	@Test
	public void screenShot() throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wu=new WebDriverUtility(driver);
		LoginPage lp=new LoginPage(driver);
		DashboardPage dsp=new DashboardPage(driver);
		ScreenshotUtility su=new ScreenshotUtility();
		
		String timestamp=new SimpleDateFormat("yyyy-mm-dd[hh-ss]").format(new Date());
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin", "admin123");
		Thread.sleep(5000);
		
		//Capture the screenshot of Home page
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File temp=ts.getScreenshotAs(OutputType.FILE);
//		File perm=new File("./Reports/dashboards"+timestamp+".png");
//		FileHandler.copy(temp, perm);
		su.captureScreenshot(driver, "DashboardPage");
		//Capture the screenshot of web element
		
		su.captureScreenshot(dsp.getRecruitment(), "recruitment");
		
//		WebElement  recruitmentLink = dsp.getRecruitment();
//		File tempsrc=recruitmentLink.getScreenshotAs(OutputType.FILE);
//		File permTrg=new File("./Reports/recrutimentlink.png");
//		FileHandler.copy(tempsrc, permTrg);
		
		
		
	}

}
