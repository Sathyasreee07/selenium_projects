package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		WebElement a = d.findElement(By.name("q"));
		Point b = a.getLocation();
		System.out.println(b);
		System.out.println(b.getX());
		System.out.println(b.x);
		System.out.println(b.getY());
		System.out.println(b.y);
	}

}
