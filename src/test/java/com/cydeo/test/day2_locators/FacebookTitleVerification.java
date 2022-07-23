package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification {
    /*
    TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook - log in or sign up”
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com");
        String ExpectedTitle="Facebook - log in or sign up";
        String actualTitle= driver.getTitle();

        Thread.sleep(2000);
        if(actualTitle.equals(ExpectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
        Thread.sleep(2000);
        driver.close();
    }
}
