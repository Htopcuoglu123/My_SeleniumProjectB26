//package com.cydeo.test.extra_Sessions;
//
//import com.cydeo.test.base.TestBase;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Explicit_Waits_Test extends TestBase {
//    @Test
//    public void test1(){
//        //Task 1
//        //
//        //		- Go to "https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html"
//        //		- Click buttons in order
//        //		- Verify messages are equal after click all buttons
//        //				- All Buttons Clicked
//        //				- Clickable Buttons
//        //				- Click Buttons In Order
//
//        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
//
//        WebDriverWait wait=new WebDriverWait(driver,15);
//
//        WebElement start = driver.findElement(By.id("button00"));
//        System.out.println(start.isEnabled());     // true
//
//        WebElement one = driver.findElement(By.id("button01"));
//        System.out.println(one.isEnabled());      // false
//
//        WebElement two = driver.findElement(By.id("button02"));
//        System.out.println(two.isEnabled());      // false
//
//        WebElement three = driver.findElement(By.id("button03"));
//        System.out.println(three.isEnabled());      // false
//
//
//        start.click();
//        wait.until(ExpectedConditions.elementToBeClickable(one));
//
//        one.click();
//        wait.until(ExpectedConditions.elementToBeClickable(two));
//
//        two.click();
//        wait.until(ExpectedConditions.elementToBeClickable(three));
//
//        three.click();
//        String expectedResult="All Buttons Clicked";
//        wait.until(ExpectedConditions.textToBe(By.cssSelector("#buttonmessage"),"All Buttons Clicked"));
//        String actualResult= driver.findElement(By.cssSelector("#buttonmessage")).getText();
//        Assert.assertEquals(actualResult,expectedResult,"All buttons clicked message is not displayed correctly.");
//
//        expectedResult="Clickable Buttons";
//        wait.until(ExpectedConditions.textToBe(By.cssSelector("#buttonmessage"),"Clickable Buttons"));
//        actualResult=driver.findElement(By.cssSelector("#buttonmessage")).getText();
//        Assert.assertEquals(actualResult,expectedResult,"Clickable buttons message is not displayed correctly.");
//    }
//}
