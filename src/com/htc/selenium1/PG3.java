package com.htc.selenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.htc.webdrivergenerator.DriverGeneratorold;

public class PG3 {
    public static void main(String[] args) {
    	WebDriver driver = DriverGeneratorold.genDriver() ;
        driver.get("http://www.popuptest.com/popuptest2.html");
        //driver.close();//only the current window will close.
       driver.quit();  // using QUIT all windows will close
    }
}