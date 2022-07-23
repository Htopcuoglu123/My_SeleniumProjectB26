package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCydeoClassLocatorPractice {
    public static void main(String[] args) throws InterruptedException {
       /*


4- Verify title is as expected:
Expected: Practice

PS: Locate “Home” link using “className” locator

        */
        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        Thread.sleep(2000);
        //3- Click to “Home” link
        driver.findElement(By.className("nav-link")).click();
        //4- Verify title is as expected:
        //Expected: Practice
        Thread.sleep(2000);
        String expectedTitle="Practice";
        String actualTitle=driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
        Thread.sleep(2000);
        driver.quit();



    }
}
