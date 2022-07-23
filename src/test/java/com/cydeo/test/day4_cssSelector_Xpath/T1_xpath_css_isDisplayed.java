package com.cydeo.test.day4_cssSelector_Xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {
    public static void main(String[] args) throws InterruptedException {
        /*
        TC #1: XPATH and cssSelector Practices

         */
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/forgot_password
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        // a. Locate “Home” link using cssSelector, class value
        WebElement homeLink1=driver.findElement(By.cssSelector("a.nav-link"));
        // a. Locate “Home” link using cssSelector, href value
        WebElement homeLink2=driver.findElement(By.cssSelector("a[href='/']"));

        //Locate HomeLink using XPath
        WebElement homeLink3=driver.findElement(By.xpath("//a[@class='nav-link']"));

        //Locate homeLink using xpath text element
        WebElement homeLink4=driver.findElement(By.xpath("//a[.='Home']"));



//        b. “Forgot password” header
        //Locate forgotPassword using cssSelector from parent to child syntax 1
        WebElement forgotPswdHeader=driver.findElement(By.cssSelector("div[class='example']>h2"));

        //Locate forgotPassword using cssSelector from parent to child syntax 2
        WebElement forgotPswdHeader1=driver.findElement(By.cssSelector("div.example>h2"));

        ////Locate forgotPassword using xpath
        WebElement forgotPassword=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));



       // c. “E-mail” text
        WebElement email=driver.findElement(By.cssSelector("label[for='email']"));
        //Locate email Text by using xpath
        WebElement email1=driver.findElement(By.xpath("//label[@for='email']"));



        //d. E-mail input box
        WebElement emailInputBox=driver.findElement(By.cssSelector("input[name='email']"));
//Locate email input box by using xpath
        WebElement emailInputBox1=driver.findElement(By.xpath("//input[@type='text']"));


//        e. “Retrieve password” button
        WebElement button= driver.findElement(By.cssSelector("button#form_submit"));//button#form_submit>i this is showing the same element
        // so you can use either one( button#form_submit  or button#form_submit>i
        WebElement button1=driver.findElement(By.cssSelector("button.radius"));

//Locate Retrieve password button by using xpath
        WebElement button2=driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));




//        f. “Powered by Cydeo text
        WebElement PwrdByCydeoText=driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //retrieve Powered by Cydeo text by using xpath
        WebElement PwrdByCydeoText1=driver.findElement(By.xpath("//div[@style='text-align: center;']"));


//        4. Verify all web elements are displayed.
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("forgotPswdHeader.isDisplayed() = " + forgotPswdHeader.isDisplayed());
        System.out.println("email.isDisplayed() = " + email.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("button.isDisplayed() = " + button.isDisplayed());
        System.out.println("PwrdByCydeoText.isDisplayed() = " + PwrdByCydeoText.isDisplayed());
        Thread.sleep(2000);
        driver.quit();
    }
}
