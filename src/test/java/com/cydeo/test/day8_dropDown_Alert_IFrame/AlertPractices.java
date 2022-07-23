package com.cydeo.test.day8_dropDown_Alert_IFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class AlertPractices {

    WebDriver driver;

     @BeforeMethod
    public void setUpMethod(){
         driver= WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();
         driver.get("http://practice.cydeo.com/javascript_alerts");
     }

     @Test
    public void confirmAlertTest(){
         //3. Click to “Click for JS Confirm” button

         WebElement confirmAlertBtn= driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
         confirmAlertBtn.click();
         //4. Click to OK button from the alert
         Alert alert=driver.switchTo().alert();
         alert.accept();//to click OK button we use alert.accept();

         //to cancel we use

         WebElement resultText=driver.findElement(By.xpath("//p[.='You clicked: Ok']"));

         Assert.assertTrue(resultText.isDisplayed(),"Result Test did not appear");

         //5. Verify “You clicked: Ok” text is displayed.
         assertEquals(resultText.getText(),"You clicked: Ok","Result Text did not appear");
         //on line 45 instead of creating  String variables for actual and expected
         // result text I created and used it in one line. resultText.getText() is for getting the actual text and
         //"You clicked: Ok" is for expected resultText
         // so we can do it like that also;

         //String actualResultText=resultText.getText();
         //String expectedResultText="You clicked: Ok";
         //Assert.assertEquals(actualTextResult,expectedTextResult,"Result Text did not appear");


     }
     /*
     1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts




      */
     public void promptAlertTest(){
         //3. Click to “Click for JS Prompt” button
         WebElement promptAlertBtn=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
         promptAlertBtn.click();
         //4. Send “hello” text to alert
         Alert alert=driver.switchTo().alert();
         alert.sendKeys("Hello");

         //5. Click to OK button from the alert
         alert.accept();
         //6. Verify “You entered:  hello” text is displayed.
         WebElement resultText= driver.findElement(By.id("result"));
         Assert.assertTrue(resultText.isDisplayed(),"Result Test did not appear");

         String actualText=resultText.getText();
         String expectedText="You entered:  hello";
         assertEquals(actualText,expectedText,"Result Test did not appear correctly");

     }


     @AfterMethod
    public void tearDown(){
         driver.quit();
     }
}
