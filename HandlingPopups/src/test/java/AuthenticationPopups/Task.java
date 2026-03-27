package AuthenticationPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='main-2']")).click();
		//Avoiding the file upload popup
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='uploadAction']")).sendKeys("C:\\Users\\sathy\\OneDrive\\Desktop\\CERTIFICATE\\old resume.pdf");
		
		

	}

}
