package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {

    public static void main(String[] args) throws InterruptedException {

        //1=Setting up web driver manager
        WebDriverManager.chromedriver().setup();


        //2-Create instance of WebDriver
        WebDriver driver=new ChromeDriver();

        Thread.sleep(2000);

        //3-Make our page full screen(instead of fullscreen() use maximize()
        driver.manage().window().maximize();


        driver.get("https://www.etsy.com");


        //navigate().to() method is for navigating to web page
        //driver.navigate().to("https://www.etsy.com");

        //used for stopping application. We are giving time to application, so we can see what is happening
        Thread.sleep(3000);

        //navigate().back() method is used for navigating back from the web page
        driver.navigate().back();

        Thread.sleep(3000);
        //navigate().forward() method is used for navigating forward from the web page
        driver.navigate().forward();

        Thread.sleep(3000);
        //navigate().refresh() method to refresh the page
        driver.navigate().refresh();

        //getting the title of the current page
        System.out.println("Etsy page driver.getTitle() = " + driver.getTitle());

        //getting the url of the current page
        System.out.println("Etsy page driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.navigate().to("https://www.tesla.com");

        System.out.println("Tesla page driver.getTitle() = " + driver.getTitle());

        System.out.println("Tesla page driver.getCurrentUrl() = " + driver.getCurrentUrl());


        Thread.sleep(2000);

        //this will close the current open page
       // driver.close();

        //will close all tabs/pages
        driver.quit();



    }
}
