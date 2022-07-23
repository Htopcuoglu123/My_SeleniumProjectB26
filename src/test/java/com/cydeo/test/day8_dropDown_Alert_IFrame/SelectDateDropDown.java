package com.cydeo.test.day8_dropDown_Alert_IFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectDateDropDown {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        // 1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    //3. Select “December 1st, 1923” and verify it is selected.
    @Test
    public void dateDropDownTest(){
        Select yearDropDown=new Select(driver.findElement(By.id("year")));
        Select monthDropdown=new Select(driver.findElement(By.id("month")));
        for (WebElement eachMonth : monthDropdown.getOptions()) {
            System.out.println(eachMonth.getText());
        }
        Select dayDropDown=new Select(driver.findElement(By.id("day")));
        for (WebElement eachYear : yearDropDown.getOptions()) {
            System.out.println(eachYear.getText());
        }


        //Select year using   : visible text
        yearDropDown.selectByVisibleText("1923");
        //Select month using    : value attribute Select
        monthDropdown.selectByValue("11");
        //day using : index number
        dayDropDown.selectByIndex(0);

        //Verify each year, month and day selected correctly
         String actualYear=yearDropDown.getFirstSelectedOption().getText();
         String expectedYear="1923";
         Assert.assertTrue(actualYear.equals(expectedYear),"Year selection test failed");
         //Assert.assertEquals(actualYear,expectedYear,"Year DropDown test failed");

        String  actualMonth=monthDropdown.getFirstSelectedOption().getText();
        String expectedMonth="December";
        Assert.assertTrue(actualMonth.equals(expectedMonth),"Month selection test failed");
        //Assert.assertEquals(actualMonth,expectedMonth,"Test failed");

        String actualDay=dayDropDown.getFirstSelectedOption().getText();
        String expectedDay="1";
        Assert.assertTrue(actualDay.equals(expectedDay),"Day selection test failed");
        //Assert.assertEquals(actualDay,expectedDay,"Day dropDown failed");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
