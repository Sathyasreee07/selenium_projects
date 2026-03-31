package com.orangehrm.seleniumuiframework.pim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class addEmployeeTestnew {
	@Test(priority = 0)
	public void addNewEmployee() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[.=' Login ']")).click();

		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();

		driver.findElement(By.name("firstName")).sendKeys("satya");
		driver.findElement(By.name("middleName")).sendKeys("sree");
		driver.findElement(By.name("lastName")).sendKeys("R");

		driver.findElement(By.cssSelector("[class=\"oxd-switch-input oxd-switch-input--active --label-right\"]"))
				.click();

		driver.findElement(By.xpath("//label[.='Username']/../..//input[@class='oxd-input oxd-input--active']"))
				.sendKeys("sathyaa");
		driver.findElement(By.xpath("//label[text()='Password']/../..//input")).sendKeys("Sathya@123");
		driver.findElement(By.xpath("//label[text()='Confirm Password']/../..//input")).sendKeys("Sathya@123");

		driver.findElement(
				By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"))
				.click();
	}

}
