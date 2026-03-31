package com.orangehrm.sleniumuiframework.object_repository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	WebDriver driver ;
	public LogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement menu;
	
	@FindBy(linkText="Logout")
	private WebElement logout;

	public WebElement getLogoutDropDown() {
		return menu;
	}

	public void clcikLogoutDropDown() {
		getLogoutDropDown().click();
	}

	public WebElement getLogout() {
		return logout;
	}

	public void clcikLogout() {
		getLogout().click();
	}
	public void logout() {
		clcikLogoutDropDown();
		clcikLogout();
		
	}
	
	
	

}