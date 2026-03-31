package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) throws InterruptedException {
		//Step 1 lanuch the browser 
		WebDriver driver=new ChromeDriver();
		
		//step 2 navigate to web page 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		//step 3 enter user name password
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(3000);
		//verification
		WebElement homepage=driver.findElement(By.xpath("//h6"));
		
		if(homepage.isDisplayed()) {
			System.out.println("the dome page is displayed: status-pass");
		}
		else {
			System.out.println("the home page is not displyed status fail");
		}
	}

}
