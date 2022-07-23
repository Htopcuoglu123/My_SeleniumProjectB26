package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3TC4 {
    /*
    TC #4: Practice Cydeo – Class locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “className” locator

     */

    @Test
    public void day3TC4(){
        Driver.getDriver().get("https://practice.cydeo.com/inputs");
        WebElement homeLink=Driver.getDriver().findElement(By.className("nav-link"));
        homeLink.click();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Practice");
        Driver.closeDriver();

    }
}
