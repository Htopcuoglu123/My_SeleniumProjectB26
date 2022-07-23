package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    /*
    TC#3: Google search
1- Open a Chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
     */
    public static void main(String[] args) throws InterruptedException {
      // 1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");
        Thread.sleep(3000);

        //3- Write “apple” in search box
        //4- Click google search button
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("apple"+ Keys.ENTER);
       //searchBox.sendKeys from keys class will let me enter the keyword and Keys.ENTER will
        // help me click enter, so I can search

        //5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedTitle="apple";
        String actualTitle=driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title Verification passed");
        }else{
            System.out.println("Title Verification failed");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
