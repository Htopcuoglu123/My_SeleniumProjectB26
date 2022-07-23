package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CydeoPracticeToolVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" https://practice.cydeo.com ");

        String expectedUrl="cydeo";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL verification is passed");
        }else{
            System.out.println("URL verification is failed");
        }
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is failed");
        }

        Thread.sleep(2000);

        driver.quit();
    }
}
