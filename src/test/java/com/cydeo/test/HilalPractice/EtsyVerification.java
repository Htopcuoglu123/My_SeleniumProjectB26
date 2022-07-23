package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtsyVerification {
    /*
    TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
     */
    @Test
    public void EtsyVerification(){
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));
        WebElement searchBar=Driver.getDriver().findElement(By.name("search_query"));
        searchBar.sendKeys("wooden spoon"+ Keys.ENTER);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Wooden spoon - Etsy");
        Driver.closeDriver();
    }
}
