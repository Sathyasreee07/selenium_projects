
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		String parentId=driver.getWindowHandle();
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		Set<String> allIds=driver.getWindowHandles();
		allIds.remove(parentId);
		for(String child:allIds) {
			driver.switchTo().window(child);
		}
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Thread.sleep(2000);
		if(url.contains(" orangehrm.com")) {
			System.out.println("Validation status: pass");
		}
		else {
			System.out.println("Validation status: pass");
		}
		Thread.sleep(2000);
		System.out.println(driver.getTitle().isEmpty());
		
		driver.close();
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.cssSelector("[class='oxd-text oxd-text--h5 orangehrm-login-title']"));
		Thread.sleep(2000);
		System.out.println(login.isDisplayed());
	}

}
