package com.cydeo.test.extra_Sessions;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionsPractice extends TestBase {
    // Task 1
    //       - Go to  "http://automationpractice.com/index.php"
    //       - Hover over on Dresses button
    //       - Verify following subCategories are displayed
    //       				Casual Dresses
    //       				Evening Dresses
    //       				Summer Dresses
@Test
    public void test1(){
        //- Go to  "http://automationpractice.com/index.php"
        driver.get("http://automationpractice.com/index.php");
        WebElement dresses=driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
        System.out.println("dresses.getLocation().getX() = " + dresses.getLocation().getX());
    //       - Hover over on Dresses button


        //locator for dresses=>xpath=(//a[@title='Dresses'])[2]
        //locator for all sub categories=(//a[@title='Dresses'])[2]/..//li

        //       - Verify following subCategories are displayed
        //       				Casual Dresses
        //       				Evening Dresses
        //       				Summer Dresses
    List<WebElement> subCategories=driver.findElements(By.xpath("(//a[@title='Dresses'])[2]/..//li"));
    actions.moveToElement(dresses).perform();
    for (WebElement subcategory:subCategories) {
        System.out.println("subcategory.isDisplayed() = " + subcategory.isDisplayed());
        Assert.assertTrue(subcategory.isDisplayed());

    }


    }
}
