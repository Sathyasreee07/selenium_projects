package HandlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//Triggering anew tab in the same browser window and parallelly  switching the tool controle
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://github.com/");
		System.out.println(driver.getTitle());
	}

}
