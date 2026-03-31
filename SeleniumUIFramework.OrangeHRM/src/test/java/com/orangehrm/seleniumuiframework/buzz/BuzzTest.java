package com.orangehrm.seleniumuiframework.buzz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.orangehrm.sleniumuiframework.generic_utility.BaseClass;
import com.orangehrm.sleniumuiframework.object_repository.DashboardPage;

public class BuzzTest extends BaseClass{
	
	
	@Test
	public void buzzTest() {
		
		
		DashboardPage dbp=new DashboardPage(driver);
	//	driver.findElement(By.xpath("//span[.='Buzz']")).click();
		
		
		//add post
		driver.findElement(By.cssSelector("[class=\"oxd-buzz-post-input\"]")).sendKeys("Hiii ALL!!");
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--main']")).click();
		
		
		 // Verify
	    WebElement recentPost = driver.findElement(By.xpath("//div[contains(@class,'orangehrm-buzz-post-body')]"));

	    

	    if(recentPost.getText().contains("Hiii ALL!!")) {
	        System.out.println("Post Successfully Added");
	    } else {
	        System.out.println("Post Not Found");
	    }

	   
		
		
	}
}
