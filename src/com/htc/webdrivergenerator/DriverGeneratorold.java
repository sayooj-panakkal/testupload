package com.htc.webdrivergenerator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverGeneratorold {
	public static WebDriver genDriver() {
		
		final String mypath="E:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",mypath);
    	WebDriver driver = new ChromeDriver();
		return driver;
		
	}
	
public static WebDriver ffgenDriver() {
		
		
		System.setProperty("webdriver.gecko.driver","D:\\Sayooj\\SELENIUMjars\\geckodriver\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
		return driver;
		
	}
	
	
}
