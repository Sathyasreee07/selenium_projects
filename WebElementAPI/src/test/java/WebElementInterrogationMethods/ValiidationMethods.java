package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValiidationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.shoppersstack.com/products_page/34");
//		
//		Thread.sleep(50000);
//		
//		WebElement a=driver.findElement(By.id("Check"));
//		Thread.sleep(50000);
//		
//		System.out.println(a.isEnabled());
		
		
		driver.get("https://demoapps.qspiders.com/ui/?scenario=1");
		Thread.sleep(20000);
		WebElement a=driver.findElement(By.xpath("//button[text()='Register']"));
		Thread.sleep(20000);
		
		System.out.println(a.isDisplayed());
		
		
		System.out.println(a.isSelected());
		WebElement b=driver.findElement(By.xpath("//button[text()='Register']"));
		Thread.sleep(20000);
	
		b.click();
		System.out.println(a.isDisplayed());
		
		
		
		

	}

}
