package com.orangehrm.sleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage {
	WebDriver driver;
	public MyInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="[name='firstName']")
	WebElement firstName;
	@FindBy(css="[name='lastName']")
	WebElement lastName;
	@FindBy(xpath="//label[text()='Employee Id']/../following-sibling::div//input")
	WebElement empId;
	@FindBy(css="[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement saveBtn;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		getFirstName().sendKeys(firstName);
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		
	}
	public WebElement getEmpId() {
		return empId;
	}
	public void setEmpId(WebElement empId) {
		this.empId = empId;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}
	
}
