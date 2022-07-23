package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {
    public static void smartBearLogin(WebDriver driver,String username,String password){
        WebElement username1=driver.findElement(By.id("ctl00_MainContent_username"));
        username1.sendKeys("Tester");
        WebElement password1= driver.findElement(By.id("ctl00_MainContent_password"));
        password1.sendKeys("test");
        WebElement loginBtn1=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn1.click();
    }
}
