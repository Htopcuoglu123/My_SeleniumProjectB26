package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {
        //1-set up web driver manager
        WebDriverManager.chromedriver().setup();
        //2- create instance/object of WebDriver
        WebDriver driver=new ChromeDriver();
        //3-maximize the page
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com ");

        //actual title come from Selenium
        String actualTitle=driver.getTitle();
        System.out.println("Actual title of Yahoo: "+actualTitle);

        //expected title comes from requirements
        String expectedTitle="Yahoo";

        if (actualTitle.contains(expectedTitle)) {

            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is failed");
        }

        driver.quit();

    }
}
