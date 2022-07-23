package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_radioButton_Part2 {

    public static void main(String[] args) throws InterruptedException {
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/radio_buttons
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();

        //4-Locate all sport radio buttons

        //to locate all the sports radio buttons we select the attribute value that is the same for all
        //sport radio buttons(Unique for only sport radio buttons) which was name='sport' in this case
        List<WebElement> sportRadioButtons=driver.findElements(By.xpath("//input[@name='sport']"));

        //5-Click all the sport radio buttons
        for (WebElement each:sportRadioButtons) {
          Thread.sleep(2000);
          each.click();
        }
    }
}