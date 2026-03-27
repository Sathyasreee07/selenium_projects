package SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepositroy_PageFactory.LoginPage;

public class LoginPageFactoryTest {
	WebDriver driver;
	
	@Test
	public void login() {
		driver=new ChromeDriver();
		LoginPage ln=new  LoginPage(driver);
		ln.enterUrl("https://www.saucedemo.com/");
		ln.enterCredentials("standard_user", "secret_sauce");
		ln.clcikLogin();
	}
	
	

}
