package HandlingJavascirptPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
		driver.findElement(By.cssSelector("[type='submit']")).click();

	}

}
