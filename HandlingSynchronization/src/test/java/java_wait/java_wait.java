package java_wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(4000);
		driver.navigate().to("https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497");
		Thread.sleep(2000,50000);
		
		driver.navigate().to("https://www.shoppersstack.com/");
		
		Thread.sleep(Duration.ofSeconds(5));
		


	}

}
