package com.cydeo.test.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day4Homework1 {
    public static void main(String[] args) throws InterruptedException {

     // TC #3: Practice Cydeo/ForgotPassword URL verification
        //1. Open Chrome browser
        //2. Go to http://practice.cydeo.com/forgot_password
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/forgot_password");

       //3. Enter any email into input box
        WebElement emailInputBox=driver.findElement(By.xpath("//input[@type='text']"));
        emailInputBox.sendKeys("john@cydeo.com");
        //4. Click on Retrieve password
        WebElement retrievePwdBtn=driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        retrievePwdBtn.click();
        //5. Verify URL contains:
        //Expected: “email_sent”
       String expectedURL="email_sent";
       if(driver.getCurrentUrl().contains(expectedURL)){
           System.out.println("passed");
       }else{
           System.out.println("failed");
       }
       //6. Verify textbox displayed the content as expected.
        //Expected: “Your e-mail’s been sent!”
        WebElement textBox= driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
        System.out.println("textBox.isDisplayed() = " + textBox.isDisplayed());

        Thread.sleep(2000);
        driver.quit();
    }
}
