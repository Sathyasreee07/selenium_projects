package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		WebElement a=d.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(2000);
		Dimension dim=a.getSize();
		Thread.sleep(2000);
		System.out.println("dimension of search button"+dim);
		Thread.sleep(2000);
		System.out.println(dim.getHeight());
		Thread.sleep(2000);
		System.out.println(dim.getWidth());
		Thread.sleep(2000);
		System.out.println(a.getCssValue("height"));

	}

}
