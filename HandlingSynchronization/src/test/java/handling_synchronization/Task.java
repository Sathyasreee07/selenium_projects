package handling_synchronization;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		
		
	
		Set<String> allIds=driver.getWindowHandles();
		for(String childid:allIds) {
			driver.switchTo().window(childid);
			if (!driver.getCurrentUrl().contains("youtube")) {
	            driver.close();   
	        }
			
		}
		
		driver.findElement(By.name("search_query")).sendKeys("Manichiru");
		driver.findElement(By.cssSelector("[class='ytSearchboxComponentSearchButton']")).click();
		driver.findElement(By.cssSelector("[aria-label='Sirai - Mannichiru Lyric Video | Vikram Prabhu | LK Akshay Kumar | Justin Prabhakaran |Suresh R 3 minutes, 51 seconds']")).click();
			
	}

}
