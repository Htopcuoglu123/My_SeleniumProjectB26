package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1TC1_CydeoPracticeToolVerifications {
    @Test
    public void cydeoPracticeToolVerifications(){
        Driver.getDriver().get(" https://practice.cydeo.com");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cydeo"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Practice"));
        Driver.closeDriver();
    }
}
