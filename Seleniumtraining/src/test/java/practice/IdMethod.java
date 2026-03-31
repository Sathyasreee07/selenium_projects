package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/?hl=in");
		Thread.sleep(2000);
	driver.findElement(By.id("APjFqb")).sendKeys("Panimalar engineering college");
		
		//Application 2
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
		
		//Application 3
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		driver.findElement(By.id(":r0:")).sendKeys("sath@gmail.com");
//		Application 4
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("login_field")).sendKeys("sath@gmail.com");
		
		//Application 5
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		
		//Application 6
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search2")).sendKeys("Testing");
		
		//Application 7
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("dummy")).sendKeys("India");

//		//Application 8
		driver.get("https://www.tamilmatrimony.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("NAME")).sendKeys("DORA");
	
		//Application 9
		
		driver.get("https://www.hackerrank.com/work/free-trial");
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).sendKeys("DORA");
		
		//Application 10
		
		driver.get("https://www.ilovepdf.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("loginEmail")).sendKeys("sath@gmail.com");
		
		
		
		
		
		
		
	}

}
