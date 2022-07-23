package com.cydeo.test.day7_testNG_dropDown_Alert_iFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //  1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void informationAlertTest(){
//        3. Click to “Click for JS Alert” button
        WebElement jsAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertButton.click();

//        4. Click to OK button from the alert
        //driver.switchTo
        Alert alert=driver.switchTo().alert();
        alert.accept();//accept() will click on OK button on JS Alert

//        5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText=driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed");//assertTrue() will check if argument is true or false
        String actualResultTest=resultText.getText();
        String expectedResult="You successfully clicked an alert";
        Assert.assertEquals(actualResultTest,expectedResult,"Result Text is not displayed correctly");
    }
}
