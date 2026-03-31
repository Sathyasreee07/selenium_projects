package InterrogationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterrogationApiMethods {

	public static void main(String[] args) throws InterruptedException {
		//getTitle()  returnn type :String
		//getPageSource()
		//getCurrentUrl()
		//getWindowHandle()
		//getWindowHandles : Set<String>
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		//getTitle
//		String a=d.getTitle();
//		String b="Demo Web Shop. Login";
		
		//getCurrentUrl
		String a=driver.getCurrentUrl();
		String b="https://demowebshop.tricentis.co";
		if(a.equals(b)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		
		//getPageSource
		System.out.println(driver.getPageSource());
		
		
	}

	

}
