package HandlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		//clicking oon View more of Laptops
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		//Switching the tool control to child window to perform action on its web element
		String parentId=driver.getWindowHandle();
		Set<String> allWindowId=driver.getWindowHandles();
		allWindowId.remove(parentId);
		for(String childId:allWindowId) {
			//switching the tool control to the child windoww popup
			driver.switchTo().window(childId);
		}
		//click on add to cart in child window
	    WebElement	addToCart =driver.findElement(By.tagName("button"));
	    addToCart.click();
	    addToCart.click();
	    Thread.sleep(2000);
	    WebElement cartLogo= driver.findElement(By.xpath("//*[name()='svg']"));
	    
	    cartLogo.click();
	    Thread.sleep(2000);
	    //verify if the shopping list is visible
	    WebElement	shoppingCartList =driver.findElement(By.tagName("h2"));
	    if(shoppingCartList.isDisplayed()) {
	    	System.out.println("Test case status: Pass");
	    }
	    else {
	    	System.out.println("Test case status: fail");
	    }
	    //close the popup
	    Thread.sleep(2000);
	    driver.close();

	}

}
