import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://demo.automationtesting.in/Register.html");
//		Thread.sleep(20000);
//		//Locating the skills dropdown
//		WebElement dropdown=driver.findElement(By.id("Skills"));
//		//Making object of select class
//		Select sel =new Select(dropdown);
//		//calling select method
//		//1 By index
//		sel.selectByIndex(9);
//		Thread.sleep(2000);
//		//2 By Value attribute
//		sel.selectByValue("Data Analytics");
//		Thread.sleep(2000);
//		//3 By VisibleText
//		sel.selectByVisibleText("Engineering");
//		Thread.sleep(2000);
//		//4 By ContainsVisibleText
//		sel.selectByContainsVisibleText("script");
//		Thread.sleep(2000);
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		  
		Select sel = new Select(driver.findElement(By.id("select-multiple-native")));
		sel.selectByVisibleText("John Hardy Women's L...");
		Thread.sleep(2000);
		sel.selectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
		sel.selectByVisibleText("White Gold Plated Pr...");
		Thread.sleep(2000);
		sel.selectByVisibleText("Pierced Owl Rose Gol...");
		Thread.sleep(2000);
//		deselect by index
		sel.deselectByIndex(6);
		Thread.sleep(2000);
//		deselect by value
		sel.deselectByValue("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet");
		Thread.sleep(2000);
//		deselect by visible text
		sel.deselectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
//		deselect by Contains visible text
		sel.deSelectByContainsVisibleText("Pierced Owl");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("John Hardy Women's L...");
		Thread.sleep(2000);
		sel.selectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
		sel.selectByVisibleText("White Gold Plated Pr...");
		Thread.sleep(2000);
		sel.selectByVisibleText("Pierced Owl Rose Gol...");
		Thread.sleep(2000);
		
		sel.deselectAll();
		
		
//options checkbox
		
//		List<WebElement>allop=sel.getOptions();
//		for(WebElement all:allop) {
//			System.out.println(all.getText());
//		}
		
		
		
		
//		d.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");	
//		Thread.sleep(2000);
//		Select s=new Select(driver.findElement(By.id("select3")));
//		Thread.sleep(2000);
//		List<WebElement>drop=s.getOptions();
//		for(WebElement a:drop) {
//			Thread.sleep(2000);
//			System.out.println(a.getText());
//		}
		
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
