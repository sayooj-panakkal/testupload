package com.htc.selenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.htc.webdrivergenerator.DriverGeneratorold;



import org.openqa.selenium.chrome.ChromeDriver;
//This programs demonstrates testing using Selenium.
//without using TestNG
public class PG1 {


    public static void main(String[] args) {
    	WebDriver driver = DriverGeneratorold.genDriver() ;
		
        String baseUrl = "https://eportal.htcindia.com//";
        String expectedTitle = "Employee Portal";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        System.out.println("Expected title given in the program  is : "+expectedTitle);

        System.out.println("Actual title obtained by WebDriver is : "+actualTitle);

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close 
        driver.close();
       
    }

}