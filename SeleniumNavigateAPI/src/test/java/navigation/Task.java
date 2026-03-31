package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Automation");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tools");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		
	}

}
