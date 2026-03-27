package InterrogationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterrogationWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demoapps.qspiders.com/");
		Thread.sleep(5000);
		//fetching 32 char unique window id
		System.out.println(d.getWindowHandle());
		//refresh the page
		d.navigate().refresh();
		Thread.sleep(2000);
		d.get("https://demowebshop.tricentis.com/");
		System.out.println(d.getWindowHandle());
		d.navigate().back();
		//if it refreshed opened in the same tab then window id comes same

	}

}
