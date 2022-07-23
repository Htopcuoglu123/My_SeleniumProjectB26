package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndFortNavigation {

    public static void main(String[] args) throws InterruptedException {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //2- Go to: https://google.com
        driver.navigate().to(" https://google.com");
        //3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();
        //4- Verify title contains:
        //  Expected: Gmail
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        String expectedTitle=" Gmail";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
        //5- Go back to Google by using the .back();
        Thread.sleep(2000);
        driver.navigate().back();
        //6- Verify title equals:
        //  Expected: Google
        Thread.sleep(2000);
        String actualTitle2=driver.getTitle();
        String expectedTitle2="Google";
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

        driver.quit();

    }
}
