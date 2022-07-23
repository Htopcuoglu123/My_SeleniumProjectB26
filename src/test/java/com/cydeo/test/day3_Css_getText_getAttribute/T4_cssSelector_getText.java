package com.cydeo.test.day3_Css_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {

       // 1- Open a chrome browser
        WebDriver  driver= WebDriverFactory.getDriver("chrome");
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
//        3- Verify “Reset password” button text is as expected:
//        Expected: Reset password
        WebElement resetPasswordBtn=driver.findElement(By.cssSelector("button.login-btn"));
        //WebElement resetPasswordBtn=driver.findElement(By.cssSelector("button[value='Reset password']"));
        String expectedResetPasswordBtnText="Reset password";
        String actualResetPasswordBtnText=resetPasswordBtn.getText();
        if(expectedResetPasswordBtnText.equals(actualResetPasswordBtnText)){
            System.out.println("Reset password button text verification passed");
        }else{
            System.out.println("Reset password button text verification failed");
        }
        driver.quit();
    }
}
