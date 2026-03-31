package com.orangehrm.seleniumuiframework.pim;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddEmployeeTest extends Base {
	@Test(priority=0)
	public void logInTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
	}
	
	
	@Test (priority=1,dependsOnMethods="logInTest")
	public void addEmployeeTest() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("satya");
		driver.findElement(By.name("middleName")).sendKeys("sree");
		driver.findElement(By.name("lastName")).sendKeys("R");
		
		driver.findElement(By.cssSelector("[class=\"oxd-switch-input oxd-switch-input--active --label-right\"]")).click();
		
		driver.findElement(By.xpath("//label[.='Username']/../..//input[@class='oxd-input oxd-input--active']")).sendKeys("sathyaa");
		driver.findElement(By.xpath("//label[text()='Password']/../..//input")).sendKeys("Sathya@123");
		driver.findElement(By.xpath("//label[text()='Confirm Password']/../..//input")).sendKeys("Sathya@123");
		
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		
		
	}
	
	
	@Test(priority=2, dependsOnMethods="addEmployeeTest")
	public void empoleeVerification() {
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		
		driver.findElement(By.xpath("//label[.='Username']/../..//input")).sendKeys("sathyaa");
	    WebElement userRole= driver.findElement(By.xpath("//div[.='User Role']/..//i"));
	    Actions action=new Actions(driver);
	    action.click(userRole).pause(1000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
	    
	    WebElement empName= driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].value='satya sree R'",empName);
	    
	    
	    WebElement  status= driver.findElement(By.xpath("//div[.='Status']/..//i"));
	    action.click(status).pause(1000).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
	    
	     driver.findElement(By.xpath("//button[text()=' Search ']")).click();
	     
	     WebElement record= driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//span"));
	     
	    if(record.getText().contains("Record Found")) {
	    	Reporter.log("Record Found",true);
	    }
	    else {
	    	Reporter.log("Record Not Found",true);
	    }
	}
	
//	@Test(priority=3, dependsOnMethods="logInTest")
//	public void logOutTest() {
//		driver.findElement(By.cssSelector(".oxd-userdropdown-tab")).click();
//		driver.findElement(By.linkText("Logout")).click();
//	}
//	
}
