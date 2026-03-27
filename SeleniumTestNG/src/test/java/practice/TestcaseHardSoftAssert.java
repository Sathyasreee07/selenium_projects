package practice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestcaseHardSoftAssert {
	
	WebDriver driver;
	@BeforeClass
	 public void beforeClass() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	@Test(priority=0)
	public void logInTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
 		String actualValue=driver.findElement(By.tagName("h5")).getText();
 		String expectedValue="Login";
 		
 		//Hard assertion
 		Assert.assertEquals(actualValue,expectedValue);
 		if(actualValue.equals(expectedValue)) {
			System.out.println("Staus: Pass");
		}
		else {
			System.out.println("Status: Fail");		
		}
 		
 		//Soft Assertion
 		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualValue, expectedValue);
		if(actualValue.equals(expectedValue)) {
			System.out.println("Staus: Pass");
		}
		else {
			System.out.println("Status: Fail");
				
		}
 		
 		
		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[.=' Login ']")).click();
	}
	
}
