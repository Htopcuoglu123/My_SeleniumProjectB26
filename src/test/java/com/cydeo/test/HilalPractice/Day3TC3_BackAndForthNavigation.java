package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3TC3_BackAndForthNavigation {
    /*
    TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
     */
    @Test
    public void day3TC3_BackAndForthNavigation(){
        Driver.getDriver().get("https://google.com");
        WebElement gmailLink=Driver.getDriver().findElement(By.linkText("Gmail"));
        gmailLink.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Gmail"));
        Driver.getDriver().navigate().back();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Google");
        Driver.closeDriver();


    }
}
