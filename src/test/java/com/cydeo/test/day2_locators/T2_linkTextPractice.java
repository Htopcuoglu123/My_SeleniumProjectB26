package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_linkTextPractice {
    /*
    TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com" );

        Thread.sleep(3000);

        //3- Click to A/B Testing from top of the list.
        WebElement abLinkText=driver.findElement(By.linkText("A/B Testing"));
        abLinkText.click();
        Thread.sleep(3000);
//        4- Verify title is:
//        Expected: No A/B Test
        String expectedTitle="No A/B Test";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("No A/B Test Title Verification is passed");
        }else{
            System.out.println("No A/B Test Title Verification failed");
        }
        Thread.sleep(3000);
        //5- Go back to home page by using the .back();
        driver.navigate().back();

        Thread.sleep(2000);

        //6- Verify title equals:
        //  Expected: Practice
        expectedTitle="Practice";
        actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Practice Title Verification is passed");
        }else{
            System.out.println("Practice Title Verification failed");
        }


        driver.quit();


    }
}
