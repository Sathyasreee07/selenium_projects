package InterrogationApi;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterrogationWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(20000);
		//Fetching the Window ID of parent window and printing
		String parentId=driver.getWindowHandle();
		System.out.println("parrent id"+ parentId);
		//Click on a tab to get child window pop and printing it 
		driver.findElement(By.xpath("//button[text()='view more']")).click();
		Thread.sleep(20000);
		//fetching the window ids of Both parent and child window popoup
		Set<String> allWindowIds=driver.getWindowHandles();
		System.out.println(allWindowIds);
		//remove parent if 
		allWindowIds.remove(parentId);
		
		//fetching child id
		for(String a:allWindowIds) {
			System.out.println(a);
		}
		Thread.sleep(20000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
//		String s="";
//		d.findElement(By.partialLinkText("Facebook")).click();
//		Thread.sleep(2000);
//		d.findElement(By.partialLinkText("Twitter")).click();
//		Set<String>allwindowid1=d.getWindowHandles();
//		for(String a:allwindowid1) {
//			d.switchTo().window(a);
//			Thread.sleep(2000);
//			String title=d.getTitle();
//			System.out.println(title);
//			System.out.println(a);
//		}
	}

}
