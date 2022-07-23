package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Browser_Utils;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Day5Task4_RadioBtnHandling {
    /*
    TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
     */

    @Test
    public void RadioBtnHandling(){
        Driver.getDriver().get("https://practice.cydeo.com/radio_buttons");
        List<WebElement>sportRadioBtns=Driver.getDriver().findElements(By.xpath("//input[@name='sport']"));
        WebElement hockeyBtn=Driver.getDriver().findElement(By.id("hockey"));
        Browser_Utils.clickAndVerifyRadioBtn(Driver.getDriver(),"sportRadioBtns","hockeyBtn");
        Driver.closeDriver();
    }
}
