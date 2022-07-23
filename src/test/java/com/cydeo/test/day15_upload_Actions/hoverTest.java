package com.cydeo.test.day15_upload_Actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class hoverTest {
    @Test
    public void hoverTest() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoHoverOverPractice_url"));
        WebElement img1=Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement firstImgText=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(img1).perform();
        Assert.assertTrue(firstImgText.isDisplayed());
        List<WebElement>images=Driver.getDriver().findElements(By.tagName("img"));
        for (WebElement each:images) {
            actions.moveToElement(each).pause(1000).perform();
        }

        Driver.closeDriver();

    }
}
