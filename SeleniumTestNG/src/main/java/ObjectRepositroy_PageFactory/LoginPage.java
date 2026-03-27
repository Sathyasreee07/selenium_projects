package ObjectRepositroy_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//It automatically initilize the located WE on calling 
		PageFactory.initElements(driver,this);
	}
	
	
	

	//Bussiness logic to login
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="Login-buttom")
	private WebElement loginBtn;
	
	public void enterUrl(String Url) {
		driver.manage().window().maximize();
		
	}
	public void enterCredentials(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	

	//getter and setters
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(String un) {
//		this.username = username; 
		//inseted of doing this 
		username.sendKeys(un);
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clcikLogin() {
		loginBtn.click();
	}
	
	

}
