package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToString {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//Navigating to Google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//Navigate to YT
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		//Navigate tp Wikipedia
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		driver.quit();

	}

}
