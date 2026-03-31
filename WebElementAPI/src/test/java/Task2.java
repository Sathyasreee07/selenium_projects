import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(2000);
		
		WebElement role=driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
		role.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Admin']")).click();
		Thread.sleep(2000);
        System.out.println(role.getText());
        Thread.sleep(2000);
        role.click();
        Thread.sleep(2000);
        
    	driver.findElement(By.xpath("//div[@role='option']//span[text()='ESS']")).click();
    	Thread.sleep(2000);
        System.out.println(role.getText());
        
        driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
        Thread.sleep(2000);
        
		driver.findElement(By.cssSelector("[class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(2000);
        
        driver.quit();
		
		
	

		

	}

}
