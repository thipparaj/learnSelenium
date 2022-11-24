package com.practice.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	String browser;
	
	static public WebDriver driver;
	public BrowserSetup(String browser){
		this.browser=browser;
		if(this.browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions option = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(option);
		}
		else {
			System.out.println("Browser is not matching/incompatable browsers");
		}
	}
}
