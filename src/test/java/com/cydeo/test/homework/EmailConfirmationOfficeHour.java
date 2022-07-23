package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailConfirmationOfficeHour {

    public static void main(String[] args) throws InterruptedException {
        //  1- Open a chrome browser
        //    2- Go to: https://practice.cydeo.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/");
        driver.manage().window().maximize();
        //3- Click Sign Up For Mailing List ( by using partialLinkText locator)
        WebElement mailingList=driver.findElement(By.partialLinkText("Sign Up For Mailing List"));
        mailingList.click();
        //4- Verify title equals:
        //       Expected: Sign Up
        String expectedTitle="Sign Up";
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle.equals(expectedTitle) ? "Title verification passed" : "Title verification failed");
        //5- Fill form with following information  (by using name locator)
        //            fullname : John Smith
        //            email    : john@cydeo.com
        WebElement userName=driver.findElement(By.name("full_name"));
        userName.sendKeys("John Smith");
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("john@cydeo.com");
        Thread.sleep(3000);
        // 6- Click on Sign Up Button (by using name locator)
        WebElement signUpButton=driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();
        Thread.sleep(3000);
//        7- Verify title equals:
//        Expected: Signup Confirmation
        String expectedTitle1="Signup Confirmation";
        String actualTitle1=driver.getTitle();
        System.out.println(actualTitle1.equals(expectedTitle1) ?
                "'SignUp Confirmation' Title verification passed" : "SignUp Confirmation' Title verification failed");
       Thread.sleep(2000);
        driver.quit();

    }
}
