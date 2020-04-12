package com.htc.webdrivergenerator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGenerator {

	
		// TODO Auto-generated method stub
		public static WebDriver genDriver() {
			
			final String mypath="E:\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
			return driver;
			
		}

	}


