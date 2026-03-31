package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);

      	driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Amelia");
		Thread.sleep(2000);
		List<WebElement>lists= driver.findElements(By.xpath("//div[@role='listbox']"));
		
		for(WebElement list:lists) {
			if(list.getText().contains("Amelia")) {
				list.click();
				break;
			}
		}
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']")).click();
		
		
	}
}
