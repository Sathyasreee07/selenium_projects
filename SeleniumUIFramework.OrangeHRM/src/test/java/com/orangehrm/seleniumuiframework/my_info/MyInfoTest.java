package com.orangehrm.seleniumuiframework.my_info;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MyInfoTest extends Base {
	@Test(priority=0)
	public void logInTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
	}
	@Test(priority=1, dependsOnMethods="logInTest")
	public void myInfoTest() throws InterruptedException {
		
//		driver.findElement(By.xpath("//span[.='My Info']")).click();
		
		
		//firstname
		WebElement firstName = driver.findElement(By.name("firstName"));
		Thread.sleep(2000);
		firstName.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		Thread.sleep(7000);
		firstName.sendKeys("sathi");
		//lastname
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		Thread.sleep(2000);
		lastName.sendKeys("R");

//      empid
		WebElement empId = driver.findElement(By.xpath("//label[text()='Employee Id']/../following-sibling::div//input"));
		empId.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		Thread.sleep(2000);
		empId.sendKeys("3131");
	        
        //save
    	driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
    	//logout
		driver.findElement(By.cssSelector(".oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
		//login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		//my info
		driver.findElement(By.xpath("//span[.='My Info']")).click();
		WebElement firstNameCheckUpdate = driver.findElement(By.name("firstName"));
		WebElement lastNameCheckUpdate = driver.findElement(By.name("lastName"));
		
		WebElement empIdCheckUpdate= driver.findElement(By.xpath("//label[text()='Employee Id']/../following-sibling::div//input"));
		Thread.sleep(2000);
		//System.out.println(firstNameCheckUpdate.getAttribute("value") +"helo "+  empIdCheckUpdate.getAttribute("value") +" "+ lastNameCheckUpdate.getAttribute("value"));
		if(firstNameCheckUpdate.getAttribute("value").equals("sathi") && empIdCheckUpdate.getAttribute("value").equals("3131") && lastNameCheckUpdate.getAttribute("value").equals("R")) {
			System.out.println("changes Updated");
		}
		else {
			System.out.println("changes Not Updated");
		}
		driver.findElement(By.cssSelector(".oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		
	}
	
	
	
}
