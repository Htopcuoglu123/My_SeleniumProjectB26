package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDownPractice {
    /*
    1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
 Select year using   : visible text
Select month using    : value attribute Select
day using : index number
     */
    WebDriver driver;
    @BeforeClass
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
       driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void dropDown(){
        Select year=new Select(driver.findElement(By.id("year")));
        Select month=new Select(driver.findElement(By.id("month")));
        Select day=new Select(driver.findElement(By.id("day")));
        year.selectByVisibleText("1923");
        month.selectByValue("11");
        day.selectByIndex(0);
        //Verify each year, month and day selected correctly
        String actualYear=year.getFirstSelectedOption().getText();
        String expectedYear="1923";
        Assert.assertEquals(actualYear,expectedYear,"Year Test failed");
        Assert.assertEquals(month.getFirstSelectedOption().getText(),"December","Month test failed");
        Assert.assertEquals(day.getFirstSelectedOption().getText(),"1","Day test failed");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
