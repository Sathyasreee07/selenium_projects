package com.orangehrm.sleniumuiframework.object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuzzPage {
	

	
	@FindBy(css = "[class='oxd-buzz-post-input']")
	private WebElement postTextField;

	
	
	@FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--main']")
	private WebElement postBtn;
	
	

}
