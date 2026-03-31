package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(4000);
//		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		Thread.sleep(5000);
//
//		driver.findElement(By.linkText("Recruitment")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.name("firstName")).sendKeys("sathya");
//		driver.findElement(By.name("lastName")).sendKeys("sree");
		
		
		
//		driver.findElement(By.xpath("//input[@data-v-1f99f73c and @class='oxd-input oxd-input--active' and @placeholder='Type here']")).sendKeys("sathyasree@gmail.com");
//		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
//		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Logout")).click();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='For Your Dream Europe Trip: Get Up to 40%OFF*']/parent::div/parent::div/parent::div/child::div[@class='sliderFoot']/child::div/child::a")).click();

	}

}
