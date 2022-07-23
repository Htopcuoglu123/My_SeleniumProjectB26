package com.cydeo.test.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OH_GetAttribute {
    /*
       GetAttribute
    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com/
    3- Click Registration Form
    4- Verify following fields has these default values
            - First name ---> first name
            - Last name  ---> last name
            - Username   ---> username
     */
    public static void main(String[] args) {
        //1- Open a chrome browser
        //    2- Go to: https://practice.cydeo.com/
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/");
        driver.manage().window().maximize();
        // 3- Click Registration Form
        WebElement registrationForm=driver.findElement(By.cssSelector("a[href=\"/registration_form\"]"));
        registrationForm.click();
//4- Verify following fields has these default values
//            - First name ---> first name
//            - Last name  ---> last name
//            - Username   ---> username
        WebElement firstName=driver.findElement(By.cssSelector("input[name=\"firstname\"]"));
        String str="first name";
        String str1=firstName.getAttribute("placeholder");
        if (str.equals(str1)) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        WebElement lastName=driver.findElement(By.cssSelector("input[name=\"lastname\"]"));
         str="last name";
         str1=lastName.getAttribute("placeholder");
        if (str.equals(str1)) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        WebElement username =driver.findElement(By.cssSelector("input[name=\"username\"]"));
        str="username";
        str1=username.getAttribute("placeholder");
        if (str.equals(str1)) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.quit();

    }
}
