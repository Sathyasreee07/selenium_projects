package InterrogationApi;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(20000);
		String parentId=driver.getWindowHandle();
		
		System.out.println(parentId);
		
//		driver.findElement(By.xpath("a[text()='Facebook']")).click();
//		driver.findElement(By.xpath("a[text()='Twitter']")).click();
		
		driver.findElement(By.partialLinkText("Facebook")).click();
		Set<String> allid=driver.getWindowHandles();
		allid.remove(parentId);
		
		String facebook="";
		for(String a:allid) {
			facebook=a;
			System.out.println("Facebook window id"+ a);
		}
		
		
		driver.findElement(By.partialLinkText("Twitter")).click();
		Set<String> allid1=driver.getWindowHandles();
		
		allid1.remove(parentId);
		allid1.remove(facebook);
		
		for(String a:allid1) {
			System.out.println("Twitter window id"+ a);
		}
		
//		String twitter=driver.getWindowHandle();
//		Set<String> allwindowIds=driver.getWindowHandles();
//		System.out.println(allwindowIds);
		
		
		
		driver.quit();

	}

}
