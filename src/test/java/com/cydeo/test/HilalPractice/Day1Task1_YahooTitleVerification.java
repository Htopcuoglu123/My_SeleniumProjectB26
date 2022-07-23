package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1Task1_YahooTitleVerification {
    @Test
    public void day1Task1_YahooTitleVerification(){

        Driver.getDriver().get("https://www.yahoo.com");
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Yahoo"),"Title is not displayed correctly");
        Driver.closeDriver();
    }

}
