package com.cydeo.test.homework;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverOverPracticeHomework {
    @Test
    public void hover_Over_Practice_Homework(){
//        TC #3: Hover Test
//        1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoHoverOverPractice_url"));
//        2. Hover over to first image

       // WebElement firstImage=Driver.getDriver().findElement(By.xpath("//*[.='name: user1']/parent::div/preceding-sibling::img"));
        WebElement img1=Driver.getDriver().findElement(By.xpath("(//img)[1]"));


        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(img1).perform();
        //3. Assert:
//        a. “name: user1” is displayed
        WebElement firstImgText=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(firstImgText.isDisplayed());

//        b. “view profile” is displayed
        WebElement FirstviewProfileText=Driver.getDriver().findElement(By.linkText("View profile"));
        Assert.assertTrue(FirstviewProfileText.isDisplayed());
//        4. Hover over to second image
        //WebElement secondImage=Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[2]"));
        WebElement secondImage = Driver.getDriver().findElement(By.xpath("//*[.='name: user2']/parent::div/preceding-sibling::img"));
        actions.moveToElement(secondImage).perform();

//        5. Assert:
//        a. “name: user2” is displayed
        WebElement secondImgText=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        Assert.assertTrue(secondImgText.isDisplayed());
//        b. “view profile” is displayed
        WebElement secondViewProfileText=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']//following-sibling::a"));
        Assert.assertTrue(secondViewProfileText.isDisplayed());
//        6. Hover over to third image
        WebElement thirdImage=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']/parent::div/preceding-sibling::img"));
        actions.moveToElement(thirdImage).perform();

//        7. Confirm:
//        a. “name: user3” is displayed
        WebElement thirdImgText=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        Assert.assertTrue(thirdImgText.isDisplayed());

//        b. “view profile” is displayed
        WebElement thirdViewProfileText=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']//following-sibling::a"));
        Assert.assertEquals(thirdViewProfileText.getText(),"View profile");
        Driver.closeDriver();
    }
}
