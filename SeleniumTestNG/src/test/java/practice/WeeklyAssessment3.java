package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WeeklyAssessment3 extends BaseClass {
	@Test(priority = 0)

	public void logInTest() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@Test(priority = 1 , dependsOnMethods="logInTest")
	
	public void ProductPageTest() {
		WebElement productPage= driver.findElement(By.xpath("//span[.='Products']"));
		String actualValue=productPage.getText();
		String expectedValue="Products";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualValue, expectedValue);
		if(actualValue.equals(expectedValue)) {
			System.out.println("Product Page is Display : Pass");
		}
		else {
			System.out.println("Product Page is Not Display: Fail");
				
		}
	}
	@Test(priority=2,dependsOnMethods="logInTest")
	public void addToCartTest() {

	    driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button")).click();
	 
	    driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']/../../..//button")).click();
	   
	    driver.findElement(By.id("shopping_cart_container")).click();

	    List<WebElement> productsInCart =driver.findElements(By.cssSelector("[class='inventory_item_name']"));
	    String productsName="";
	    for (WebElement product : productsInCart) {
	    	productsName += product.getText();
	        
	    }

	    Assert.assertTrue(productsName.contains("Sauce Labs Backpack") && productsName.contains("Sauce Labs Bike Light"));
	    
	   
 
	}
	@Test(priority=2,dependsOnMethods="logInTest")
	public void checkOutTest() {
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("sathya");
		driver.findElement(By.id("last-name")).sendKeys("sree");
		driver.findElement(By.id("postal-code")).sendKeys("3131");
		
		driver.findElement(By.id("continue")).click();

	}
	@Test(priority=3,dependsOnMethods="logInTest")
	public void priceTest() {
		 String expectedItemTotal = "Item total: $39.98";
	        String actualItemTotal = driver.findElement(By.cssSelector(".summary_subtotal_label")).getText();

	        Assert.assertEquals(actualItemTotal, expectedItemTotal);

	     
	        String expectedTax = "Tax: $3.20";
	        String actualTax = driver.findElement(By.cssSelector(".summary_tax_label")).getText();

	        Assert.assertEquals(actualTax, expectedTax);


	        String expectedTotal = "Total: $43.18";
	        String actualTotal = driver.findElement(By.cssSelector(".summary_total_label")).getText();

	        Assert.assertEquals(actualTotal, expectedTotal);
	        if(expectedTotal.equals(actualTotal)) {
	        	Reporter.log("Status: Pass "+actualTotal,true);
	        }
	        else {
	        	Reporter.log("Status: Fail "+actualTotal,true);
	        }

	       
	        driver.findElement(By.id("finish")).click();
			
	}
	
}
