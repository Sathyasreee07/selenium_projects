package generic_utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//bussiness logic
	public void enterCredentials(String user, String pass) {

		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
	//	driver.findElement(loginBtn).click();
	}
	
//	public void enterUserName(String un) {
//		driver.findElement(username).sendKeys(un);
//	}
//	public void enterPassword(String pwd) {
//		driver.findElement(password).sendKeys(pwd);
//	}
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
}