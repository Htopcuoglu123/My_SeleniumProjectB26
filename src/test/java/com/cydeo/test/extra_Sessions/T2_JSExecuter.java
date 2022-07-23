package com.cydeo.test.extra_Sessions;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.Browser_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T2_JSExecuter extends TestBase {
    //  Task 2
    //Go to "https://www.etsy.com"
    //Search for "Wooden Spoon"
    //Click filters
    //Select free shipping(use checkbox to click free shipping.Don't use label tagged element to handle
    //Click apply filters
    //Print count of results
    @Test
    public void test2(){
        driver.get("https://www.etsy.com");
        WebElement searchBtn= driver.findElement(By.id("global-enhancements-search-query"));
        searchBtn.sendKeys("Wooden Spoon"+ Keys.ENTER);
        Browser_Utils.waitFor(5);
        WebElement filters= driver.findElement(By.xpath("//span[.='All Filters']"));
        filters.click();
        WebElement freeShipping= driver.findElement(By.cssSelector("input[name='free_shipping']"));
        //freeShipping.click();// it gives ElementClickInterceptedException
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",freeShipping);
        WebElement apply= driver.findElement(By.xpath("//button[@aria-label='Apply']"));
        js.executeScript("arguments[0].click()",apply);
        Browser_Utils.waitFor(3);
        WebElement result=driver.findElement(By.xpath("//span[@class='wt-display-inline-flex-sm']"));
        System.out.println("result.getText() = " + result.getText());

    }
}
