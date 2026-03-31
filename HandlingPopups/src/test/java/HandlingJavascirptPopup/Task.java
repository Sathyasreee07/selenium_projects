package HandlingJavascirptPopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(4000);
		String parentId=driver.getWindowHandle();
		driver.findElement(By.cssSelector("[class='desktop-searchBar']")).sendKeys("Dresses");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='desktop-submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("[title='Marks & Spencer Girls Tie-Dye Printed Fit & Flare Dress']")).click();
		
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		windows.remove(parentId);
		// Switch to new window
		for(String w : windows){
		    driver.switchTo().window(w);
		}
		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("[class='form-control mobileNumberInputform-control mobileNumberInput']")).sendKeys("8190011703");
		WebElement	signup =driver.findElement(By.cssSelector("[class='welcome-header']"));
	    if(signup.isDisplayed()) {
	    	System.out.println("Test case status: Pass");
	    }
	    else {
	    	System.out.println("Test case status: fail");
	    }
		
		
	}
}
