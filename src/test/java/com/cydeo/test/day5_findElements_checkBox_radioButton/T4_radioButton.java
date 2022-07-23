package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_radioButton {

    public static void main(String[] args) {
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/radio_buttons
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();
        // 3. Click to “Hockey” radio button
        WebElement radioButton=driver.findElement(By.xpath("//input[@id='hockey']"));
        radioButton.click();
        // 4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("radioButton.isSelected() = " + radioButton.isSelected());

        //5-Locate Green Button
        WebElement greenRadioButton=driver.findElement(By.xpath("//input[@id='green']"));

        //6-Verify if GreenButton is Enabled
        System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());


        driver.quit();


    }
}
