package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3TC3_GoogleSearch {
    /*
    TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
     */
    @Test
    public void day3TC3_GoogleSearch(){
        Driver.getDriver().get("https://google.com");
        WebElement searchBox=Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys("apple"+ Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith("apple"));
        Driver.closeDriver();

    }
}
