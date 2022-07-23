package com.cydeo.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    //By creating a private constructor we are closing the access to the object of this class from outside the class
    private Driver() {
    }

    //We make WebDriver private because we want to close access from outside the class
    // We make is static because we will use it inside static method
    private static WebDriver driver;

    //It will check if driver is null and if it is we will set up browser inside if statement
    //if you already set up driver and using it again for following line of code it will return to the same driver
    public static WebDriver getDriver() {
        if (driver == null) {
            String browserType=ConfigurationReader.getProperty("browser");
            switch(browserType){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
                    break;
                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
                    break;
            }

        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();//This line will terminate the existing driver session. After using driver.quit() driver
            // will not be null so, we assign it to null again
            driver=null;
        }
    }
}