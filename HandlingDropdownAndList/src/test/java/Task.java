import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		Select sel=new Select(driver.findElement(By.id("oldSelectMenu")));
		System.out.println(sel.isMultiple());
		
		
		Select sel1=new Select(driver.findElement(By.id("cars")));
		System.out.println(sel1.isMultiple());
	}
}
