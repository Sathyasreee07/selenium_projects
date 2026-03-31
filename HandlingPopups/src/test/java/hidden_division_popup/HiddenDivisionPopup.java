package hidden_division_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("[class='btn btn-primary']")).click();
		driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-calendar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("11")).click();
		
		
		

	}

}
