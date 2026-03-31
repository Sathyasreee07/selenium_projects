package com.orangehrm.sleniumuiframework.generic_utility;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver driver;
	WebDriverWait wait;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	//Manage 
	public void configMaximizedBrowser() {
		driver.manage().window().maximize();
	}
	//Minimize Screen
	public void configMinimizeBrowser() {
		driver.manage().window().minimize();
	}
	//Full Screen
	public void configFullscreenBrowser() {
		driver.manage().window().fullscreen();;
	}
	//Get Size
	public Dimension fetchBrowserSize() {
		Dimension dim=driver.manage().window().getSize();
		return dim;
		
	}
	//Set Size
	public void configBrowserSize(int width,int height) {
		driver.manage().window().setSize(new Dimension(width,height));
	}
	//Get Position
	public Point fetchBrowserPosition() {
		Point pt=driver.manage().window().getPosition();
		return pt;
	}
	//Set Position
	public void configBrowserPosition(int x,int y) {
		driver.manage().window().setPosition(new Point(x,y));
	}
	
	//Navigate
	//Navigate to 
	
	public void navigateToApplication(String fullUrl) {
		driver.navigate().to(fullUrl);
	}
	//Forward
	
	public void navigateForward() {
		driver.navigate().forward();
	}
	
	//Backward
	
	public void navigateBackward() {
		driver.navigate().back();
	}
	
	//Refresh
	
	public void refresh() {
		driver.navigate().refresh();
	}
	//Get
	public void enterUrl(String url) {
		driver.get(url);
	}
	
	//Get Title
	public String fetchApplicationTitle() {
		return driver.getTitle();
	}
	
	//Get CurrentUrl
	public String fetchApplicationUrl() {
		return driver.getCurrentUrl();
	}
	
	//Close 
	public void closeBrowserTab() {
		driver.close();
	}
	
	//Quit
	
	public void closingBrowserWindow() {
		driver.quit();
	}
	
	//TimeOuts
	
	//Implicit
	
	public void waitForElementsToLoad(int timeinseconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeinseconds));
	}
	
	//Explicit Wait
	
	public void WaitTilltheElementClickable(WebElement element,long maxtimeToWait) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(maxtimeToWait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public void ElementVisibilty(WebElement element,long maxtimeToWait) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(maxtimeToWait));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//PopUps
	
	//Alerts
	
	public void clickOnAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void clickOnDismiss() {
		driver.switchTo().alert().dismiss();
	}
	public void typeMessageInJavascriptPopup(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public String fetchJavaSciptPopupMessage() {
		String message=driver.switchTo().alert().getText();
		return message;
	}
	
	//Child Window Switching(Title/URL)
	
	public void fetchChildWindow(String childwindowtitle) {
		String parent=driver.getWindowHandle();
		Set<String>handles=driver.getWindowHandles();
		handles.remove(parent);
		for(String handle:handles) {
			driver.switchTo().window(handle);
			String title=driver.getTitle();
			if(title.contains(childwindowtitle)) {
				break;
			}
		}
		
		
	}
	
}


