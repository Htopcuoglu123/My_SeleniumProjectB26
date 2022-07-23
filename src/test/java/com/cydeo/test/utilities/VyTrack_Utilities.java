package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrack_Utilities {
    public static void VyTrack_Login(WebDriver driver, String userName, String password){
        WebElement userName1=driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userName1.sendKeys("username");

        WebElement password1=driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password1.sendKeys("password");

        WebElement loginBtn1=driver.findElement(By.xpath("//button[@id='_submit']"));
        loginBtn1.click();
    }
}
