package com.practice.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chrome = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chrome);
		driver.get("https://www.youtube.com/watch?v=LPT7v69guVY&ab_channel=AutomationStepbyStep");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.quit();
	}

}
