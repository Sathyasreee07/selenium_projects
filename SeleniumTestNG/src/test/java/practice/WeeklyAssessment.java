package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WeeklyAssessment extends BaseClass{
	@Test(priority = 0)

	public void logInTest() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
	}
	@Test(priority = 1,dependsOnMethods="logInTest")
	public void sortProductByPriceTest() {
		
		Select sel = new Select(driver.findElement(By.cssSelector(".product_sort_container")));
		sel.selectByVisibleText("Price (low to high)");
		driver.findElement(By.xpath("//div[.='Sauce Labs Onesie']/../../..//button")).click();
		
	}
	@Test(priority = 2,dependsOnMethods="logInTest")
	public void addToCartTest() {
		
		driver.findElement(By.xpath("//div[.='Sauce Labs Onesie']/../../..//button")).click();
		driver.findElement(By.id("shopping_cart_container")).click();

	    WebElement productInCart =driver.findElement(By.cssSelector("[class='inventory_item_name']"));
	    String actualproductInCart=productInCart.getText();
	    String expectedProductInCart="Sauce Labs Onesie";

	    Assert.assertEquals(actualproductInCart,expectedProductInCart);
	    if(actualproductInCart.equals(expectedProductInCart)) {
	    	Reporter.log("Product added to cart successfully : Pass");
	    }
	    else {
	    	Reporter.log("Product  not added to the cart : Fail");
	    }
	    
	    
		
	}
	@Test(priority=2,dependsOnMethods="logInTest")
	public void checkOutTest() {
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("sathya");
		driver.findElement(By.id("last-name")).sendKeys("sree");
		driver.findElement(By.id("postal-code")).sendKeys("3131");
		
		driver.findElement(By.id("continue")).click();

	}
	@Test(priority=2,dependsOnMethods="logInTest")
	public void orderSummaryTest() {
		String actualOrderSummary=driver.findElement(By.cssSelector("checkout")).getText();
		String expectedOrderSummary="Sauce Labs Onesie";
		
		Assert.assertEquals(actualOrderSummary,expectedOrderSummary);
		if(actualOrderSummary.equals(expectedOrderSummary)) {
			Reporter.log("Order Summary Status : Pass");
		}
		else {
			Reporter.log("Order Summary Status : Fail");
		}
		
		driver.findElement(By.id("finish")).click();

	}
	

}
