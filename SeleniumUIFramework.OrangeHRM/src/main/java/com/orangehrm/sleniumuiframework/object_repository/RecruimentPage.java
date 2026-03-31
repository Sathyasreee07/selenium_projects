package com.orangehrm.sleniumuiframework.object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruimentPage {
	WebDriver driver;
	public RecruimentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Vacancies")
	private WebElement vancanciesLink;
	
	@FindBy(linkText="Candidates")
	private WebElement candidateLink;
	
	public WebElement getVancanciesLink() {
		return vancanciesLink;
	}
	public void clickVancanciesLink() {
		getVancanciesLink().click();
	}
	public WebElement getCandidatesLink() {
		return candidateLink;
	}
	public void clickCandidatesLink() {
		getCandidatesLink().click();
	}
	
	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addCandidateBtn;
	
	
	public WebElement getAddCandidateBtn() {
		return addCandidateBtn;
	}
	public void clickAddCandidateBtn() {
		getAddCandidateBtn().click();
	}
	
	

}
