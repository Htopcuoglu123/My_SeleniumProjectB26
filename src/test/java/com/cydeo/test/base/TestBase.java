package com.cydeo.test.base;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public Actions actions;

    @BeforeMethod
    public void setUpMethod() {
        //  1. Open browser
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        actions=new Actions(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}