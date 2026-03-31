package com.orangehrm.sleniumuiframework.object_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	WebDriver driver;
	public PIMPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//span[contains(.,'Configuration')]")
	private WebElement configuration;
	
	@FindBy(linkText="Termination Reasons")
	private WebElement dropdown;
	
	@FindBy(xpath="//button[contains(.,'Add')]")
	private WebElement addbutn;
	
	@FindBy(xpath="//label[.='Name']/../..//input")
	private WebElement nametxt;
	
	@FindBy(xpath="//button[contains(.,' Save')]")
	private WebElement save;
	

	public WebElement getConfiguration() {
		return configuration;
	}

	public void clickConfiguration() {
		getConfiguration().click();
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public void clickDropdown() {
		getDropdown().click();
	}

	public WebElement getAddbutn() {
		return addbutn;
	}

	public void clickAddbutn() {
		getAddbutn().click();
	}

	public WebElement getNametxt() {
		return nametxt;
	}

	public void setNametxt(String nametxt) {
		getNametxt().sendKeys(nametxt);
	}

	public WebElement getSave() {
		return save;
	}

	public void clickSave() {
		getSave().click();
	}
	
	
	
	
	
}