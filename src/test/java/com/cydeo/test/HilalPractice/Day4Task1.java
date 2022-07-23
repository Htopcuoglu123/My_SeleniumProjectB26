package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Day4Task1 {
    /*
    TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
     */
    @Test
    public void Day4Task1(){
        Driver.getDriver().get("https://practice.cydeo.com/forgot_password ");
        WebElement homeLink=Driver.getDriver().findElement(By.cssSelector("a[class='nav-link']"));
        WebElement forgotPasswordHeader=Driver.getDriver().findElement(By.cssSelector("div[class='example']>h2"));
        WebElement emailText=Driver.getDriver().findElement(By.cssSelector("div[class='large-6 small-12 columns']>label"));
        WebElement emailBox=Driver.getDriver().findElement(By.xpath("//div[@class='large-6 small-12 columns']//input"));
        WebElement retrievePswrdBtn=Driver.getDriver().findElement(By.cssSelector("button#form_submit"));
        WebElement PoweredByCydeoText=Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailBox.isDisplayed() = " + emailBox.isDisplayed());
        System.out.println("retrievePswrdBtn.isDisplayed() = " + retrievePswrdBtn.isDisplayed());
        System.out.println("PoweredByCydeoText.isDisplayed() = " + PoweredByCydeoText.isDisplayed());
        Driver.closeDriver();


    }
}
