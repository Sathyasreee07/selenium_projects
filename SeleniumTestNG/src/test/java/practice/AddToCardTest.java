package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToCardTest extends BaseClass{
	
	@Test (priority=1)
    public void logInTest() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Verification
		WebElement swagLabsText= driver.findElement(By.cssSelector(".app_logo"));
		if(swagLabsText.getText().contains("Swag Labs")) {
			Reporter.log("Login Successfull",true);
		}else {
			Reporter.log("Login Failed",true);
		}
	}
	

	@Test(priority=2,dependsOnMethods="logInTest")
	public void addToCartTest() {

	    driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button")).click();
	 
	    driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']/../../..//button")).click();
	   
	    driver.findElement(By.id("shopping_cart_container")).click();

	    List<WebElement> productsInCart =driver.findElements(By.cssSelector("[class='inventory_item_name']"));
	    String ProductsName="";
	    for (WebElement product : productsInCart) {
	    	ProductsName += product.getText();
	        
	    }
	    if (ProductsName.contains("Sauce Labs Backpack") && ProductsName.contains("Sauce Labs Bike Light")) {
	        Reporter.log("The products has been  added to the cart sucessfully || True",true);
	    }else {
	    	Reporter.log("The products has been not added to the cart sucessfully || False",true);
	    }
	}
	
	
}
