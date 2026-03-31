package practice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert {
	
	@Test
	public void testMethod() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		String expectedTitle ="Google";
		String ActualTitle=driver.getTitle();
		
		//Hard Assertion
//		Assert.assertEquals(ActualTitle, expectedTitle);
		assertEquals(ActualTitle,expectedTitle);
		System.out.println("Test status:Pass");

	
	}

}
