package navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUrl {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(20000);
		
		//Navigating to Amazon
		URL url1=new URL("https://www.amazon.in/");
		driver.navigate().to(url1);
		Thread.sleep(20000);
		
		//Navigate to UberEats
		driver.navigate().to(new URL("https://www.swiggy.com/"));
		
		driver.quit();
		
		
		
		
		
	}

}
