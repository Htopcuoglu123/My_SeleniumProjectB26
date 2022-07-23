package com.cydeo.test.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day3_Homework1_NextBaseCRM {
    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        WebDriver driver= WebDriverFactory.getDriver("chrome");
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/ ");
        Thread.sleep(2000);
        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberText=driver.findElement(By.cssSelector("label.login-item-checkbox-label"));
        String expectedRememberText="Remember me on this computer";
        String actualRememberText=rememberText.getText();
        if (expectedRememberText.equals(actualRememberText)) {
            System.out.println("Remember Me Label Text verification passed");
        }else{
            System.out.println("Remember Me Label Text verification failed");
        }
        //4- Verify “forgot password” link text is as expected:
        //Expected: FORGOT YOUR PASSWORD?
        WebElement forgotPasswordLinkText= driver.findElement(By.cssSelector("a.login-link-forgot-pass"));
        String expectedForgotPasswordLinkText="FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLinkText=forgotPasswordLinkText.getText();
        if (expectedForgotPasswordLinkText.equals(actualForgotPasswordLinkText)) {
            System.out.println("Forgot Password Link text verification passed");
        }else{
            System.out.println("Forgot Password Link text verification failed");
        }
        Thread.sleep(2000);
        // 5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        expectedForgotPasswordLinkText="forgot_password=yes";
        actualForgotPasswordLinkText=forgotPasswordLinkText.getAttribute("href");
        if (actualRememberText.equals(expectedRememberText)) {
            System.out.println("Forgot password href test verification passed");
        }else{
            System.out.println("Forgot password href test verification passed");
        }

        driver.quit();
    }
}
