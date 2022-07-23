package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {
    /*
    TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.
     */
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void confirmationAlert(){
        WebElement jSConfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jSConfirm.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement resultText=driver.findElement(By.id("result"));
        Assert.assertTrue(resultText.isDisplayed());
//        String actualResultText=resultText.getText();
//        String expectedResultText="You clicked: Ok";
//        Assert.assertEquals(actualResultText,expectedResultText,"ResultText did not appear correctly");
        Assert.assertEquals(resultText.getText(),"You clicked: Ok","ResultText did not appear correctly");


    }
}
