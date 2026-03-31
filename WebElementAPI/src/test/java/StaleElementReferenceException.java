import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele1=driver.findElement(By.id("small-searchterms"));
		
		ele1.sendKeys("Mobile");
		
		driver.navigate().refresh();
		
//		ele1.sendKeys("Mobile"); ------> StaleElementReferenceException :previously located WebElement is no longer attached to the current DOM
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");

	}

}
