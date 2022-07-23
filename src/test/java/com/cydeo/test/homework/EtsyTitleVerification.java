package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    /*
    TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”

     */
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.etsy.com
        driver.navigate().to("https://www.etsy.com");
        Thread.sleep(2000);
        //3. Search for “wooden spoon”
        WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
//        4. Verify title:
//        Expected: “Wooden spoon | Etsy”
        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
