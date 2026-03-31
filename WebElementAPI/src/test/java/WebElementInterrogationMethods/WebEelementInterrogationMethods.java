package WebElementInterrogationMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEelementInterrogationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(20000);
		//Locating about link
		WebElement aboutLink=driver.findElement(By.id("navbarDropdown"));
		
		System.out.println("Name of my link is:(visible text) "+ aboutLink.getText() );
		
		//Fetching the tagname
		System.out.println("The tagname is "+aboutLink.getTagName());
		
		
		// fetch cssValue
		WebElement logo =driver.findElement(By.xpath("//*[name()='svg' and @id='Layer_1']"));
		System.out.println(logo.getCssValue("font"));
		System.out.println(logo.getCssValue("color"));
		System.out.println(logo.getCssValue("background-color"));
		System.out.println(logo.getCssValue("display"));
		
		
		
		driver.quit();
	}

}
