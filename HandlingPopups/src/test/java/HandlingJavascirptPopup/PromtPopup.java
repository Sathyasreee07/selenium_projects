package HandlingJavascirptPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		//clicking on the button to trigger the popup
		driver.findElement(By.cssSelector("[class='btn btn-info']")).click();
		Thread.sleep(2000);
		//Handling the popup
		
		Alert popup=driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.sendKeys("sathya");
		popup.accept();

	}

}
