package com.cydeo.test.practice;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NumOfLinks extends TestBase {
    //TC #1: Checking the number of links on the page
    //1. Open Chrome browser
    //2. Go to https://www.openxcell.com
    //3. Count the number of the links on the page and verify
    //Expected: 332

    @Test
    public void verifyNumOfLinks() throws InterruptedException {
        driver.get("https://www.openxcell.com");
        // Thread.sleep(3000);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        //Thread.sleep(3000);
//        int actualNumberOfLinks=allLinks.size();
//        int expectedNumOfLinks=337;
        System.out.println("allLinks.size() = " + allLinks.size());
        Assert.assertEquals(allLinks.size(), 337);

    }
}
