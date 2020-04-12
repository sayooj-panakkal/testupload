package com.htc.seleniumtestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.htc.webdrivergenerator.DriverGeneratorold;

public class ParallelTest {

	private WebDriver driver;
	String baseURL = "http://www.google.com/";

	@Parameters({ "browser" })
	@BeforeTest
	public void openBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("Firefox")) {
				 System.setProperty("webdriver.gecko.driver","D:\\SELENIUMjars\\gecko64\\geckodriver.exe");
				driver = new FirefoxDriver();
			} 
			else if (browser.equalsIgnoreCase("chrome")) {
				 WebDriver driver = DriverGeneratorold.genDriver() ;
		         driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("html")) {
				 //System.setProperty("webdriver.ie.driver","D:\\SELENIUMjars\\IEDriverServer.exe");
				//driver = new HtmlUnitDriver();
			}
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void login_TestCase() {
		driver.navigate().to(baseURL);
                //do something
	}

	@Test
	public void search_TestCase() {
		driver.navigate().to(baseURL);
             //do something
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}