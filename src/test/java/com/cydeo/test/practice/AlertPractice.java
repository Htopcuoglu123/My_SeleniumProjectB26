package com.cydeo.test.practice;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPractice extends TestBase {
    //TC #2: Confirmation alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Confirm” button
    //4. Click to OK button from the alert
    //5. Verify “You clicked: Ok” text is displayed.
    @Test
    public void alertPractice(){
        driver.get("http://practice.cydeo.com/javascript_alerts ");
        WebElement jSAlert= driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
        jSAlert.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement resultText= driver.findElement(By.id("result"));
        Assert.assertTrue(resultText.isDisplayed());
        Assert.assertEquals(resultText.getText(),"You clicked: Ok");

    }

}
