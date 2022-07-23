package com.cydeo.test.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Day6_Homework_EtsyCheckBoxAndRadioButton {

    // TC: Etsy checkbox and radio button
    //1. Go to https://www.etsy.com
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("https://www.etsy.com");
        //2-Search for “wooden spoon”
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
       // 3. Click on filters
        WebElement filters=driver.findElement(By.xpath("//div[@class='wt-pr-xs-1']"));
        filters.click();
        //4. Select free shipping, on sale
        WebElement freeShipping=driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        freeShipping.click();

        //5. Select under $25 Click on apply filters
        WebElement under25=driver.findElement(By.xpath("//label[@for='price-input-1']"));
        under25.click();
        WebElement apply=driver.findElement(By.xpath("//button[@aria-label='Apply']"));
        apply.click();

        //6. Print count of results
        WebElement count=driver.findElement(By.xpath("//div[@class='wt-text-right-xs wt-text-left-md wt-pr-md-0 wt-pr-xs-1']/span/span/span[1]"));
        System.out.println("Number of results= " + count.getText());

        driver.quit();


    }


}
