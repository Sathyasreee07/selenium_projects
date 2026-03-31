package com.orangehrm.seleniumuiframework.pim6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddTerminationReasonTest  extends Base{
	@Test(priority = 0)
	public void logInTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
	}

	@Test(priority = 1, dependsOnMethods = "logInTest")
	
	public void addTerminationReasonTest() {
		driver.findElement(By.xpath("//span[.='PIM']")).click();
		
		driver.findElement(By.xpath("//span[text()='Configuration ']")).click();
		driver.findElement(By.linkText("Termination Reasons")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		driver.findElement(By.xpath("//label[text()='Name']/../..//input")).sendKeys("selenium testing");
		
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
		List<WebElement> terminationReason=driver.findElements(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']/.."));
		
		boolean flag=false;
		for(WebElement reasons:terminationReason) {
			if(reasons.getText().equals("selenium")) {
				flag=true;
				break;
			}
			
		}
		if(flag) {
			System.out.println("verification status: Pass");
		}
		else {
			System.out.println("verification status: Fail");
		}
	}
	@Test(priority=2, dependsOnMethods="logInTest")
	public void logOutTest() {
		driver.findElement(By.cssSelector(".oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
