package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    public static void crm_login(WebDriver driver){

        WebElement userName=driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        userName.sendKeys("helpdesk60@cybertekschool.com");

        WebElement password=driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();
    }
    public static void crm_login(WebDriver driver,String username,String password){
        WebElement userName1=driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        userName1.sendKeys("username");

        WebElement password1=driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        password1.sendKeys("password");

        WebElement loginBtn1=driver.findElement(By.xpath("//input[@type='submit']"));
        loginBtn1.click();
    }
}
