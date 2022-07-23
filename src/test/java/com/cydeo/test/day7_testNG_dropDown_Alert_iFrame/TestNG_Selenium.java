package com.cydeo.test.day7_testNG_dropDown_Alert_iFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

  WebDriver driver;
  @BeforeMethod
  public void setUpMethod(){//we name it setUpMethod because it will be running before each method
    // we have in this class
    // set up chrome and create WebDriver instance
    driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
  }
  @AfterMethod
  public void tearDown(){
    driver.quit();
  }

  @Test
    public void googleTitle(){

    // Get "https://google.com/"
      driver.get("https://google.com/");

    // Assert: title is  "Google"
    String actualTitle=driver.getTitle();
    String expectedTitle="Google";
    //actualTitle has to be first
    Assert.assertEquals(actualTitle,expectedTitle,"Title Verification Test failed");//failed message is optional,
    //it will appear only if verification fails


    }
    @Test
    public void yahooTitle(){
      driver.get("https://yahoo.com/");
    }

    @Test
    public void etsyTitle(){
      driver.get("https://Etsy.com/");
    }
}
