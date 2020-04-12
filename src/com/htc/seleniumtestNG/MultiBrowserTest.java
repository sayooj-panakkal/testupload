package com.htc.seleniumtestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.htc.webdrivergenerator.DriverGeneratorold;

public class MultiBrowserTest {

	   private String URL = "http://www.calculator.net";
	   private WebDriver driver;
	   @Parameters("browser")
	   @Test
	   public void launchapp(String browser) {
			
	      if (browser.equalsIgnoreCase("firefox")) {
	         System.out.println(" Executing on FireFox");
	         driver = DriverGeneratorold.ffgenDriver();
	         driver.get(URL);
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         driver.manage().window().maximize();
	      } 
	      else if (browser.equalsIgnoreCase("chrome")) {
	    	   driver = DriverGeneratorold.genDriver() ;
	         driver = new ChromeDriver();
	         
	         driver.get(URL);
	         //driver.navigate().to(URL);
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         driver.manage().window().maximize();
	      } 
	      else if (browser.equalsIgnoreCase("html")) {
	         System.out.println("Executing headless");
	         
	        //driver = new htmlunit-driver();
	         driver.get(URL);
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         driver.manage().window().maximize();
	      } else {
	         throw new IllegalArgumentException("The Browser Type is Undefined");
	      }
	   }

	  /* @Test
	   public void calculatepercent() {
	      // Click on Math Calculators
	      WebElement o=driver.findElement(By.xpath("//*[@id='homelistdiv']/table/tbody/tr/td[3]/div[2]/a"));
	    //*[@id='homelistdiv']/table/tbody/tr/td[3]/div[2]/a
            o.click();
	      // Click on Percent Calculators
	      driver.findElement(By.xpath("//*[@id='content']/ul[1]/li[3]/a")).click();
	   
	      
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");

	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      // Click Calculate Button
	      driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();

	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//*[@id='content']/p[2]/font/b")).getText();	
	 
	    

	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);

	      if(result.equals("5")) {
	         System.out.println(" The Result is Pass");
	      } else {
	         System.out.println(" The Result is Fail");
	      }
	   }
*/
	   @AfterTest
	   public void closeBrowser() {
	      driver.close();
	   }
}
