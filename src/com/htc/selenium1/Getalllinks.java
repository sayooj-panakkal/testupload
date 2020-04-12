package com.htc.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.htc.webdrivergenerator.DriverGeneratorold;

public class Getalllinks {
	public static void main(String[] args) {
		   
	     
	    	WebDriver driver = DriverGeneratorold.genDriver() ;
	        driver.navigate().to("http://www.calculator.net/");
	        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("Number of Links in the Page is " + links.size());
	      
	      for (int i = 0; i<links.size(); i = i+1) {
	         System.out.println("Name of Link# " + i + links.get(i).getText());
	      }
	   }

}
 