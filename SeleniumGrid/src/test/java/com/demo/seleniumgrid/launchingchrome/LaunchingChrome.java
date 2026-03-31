package com.demo.seleniumgrid.launchingchrome;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingChrome {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-start-maximized");
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		driver.get("https://www.selenium.dev/documentation/grid/");
		Thread.sleep(4000);
		driver.quit();
				
	}

}
