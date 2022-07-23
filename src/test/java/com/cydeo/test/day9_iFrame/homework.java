package com.cydeo.test.day9_iFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class homework {
    // TC : Iframe practice
    //1. Go to: https://practice.cydeo.com/iframe
    //2. Assert: “Your content goes here.” Text is displayed.
    //3. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
    WebDriver driver;
    @BeforeClass
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
    }
    @Test
    public void checkContent(){
        driver.get("https://practice.cydeo.com/iframe");
        //2. Assert: “Your content goes here.” Text is displayed.
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        WebElement displayText=driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        String actualDisplayText=displayText.getText();
        String expectedDisplayText="Your content goes here.";
        Assert.assertTrue(displayText.isDisplayed(),"Text is not displayed");
        Assert.assertEquals(actualDisplayText,expectedDisplayText,"Text is npt displayed correctly");
        driver.switchTo().defaultContent();
        WebElement h3Title=driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertEquals(h3Title.getText(),"An iFrame containing the TinyMCE WYSIWYG Editor","Text is not displayed correctly");
    }
@AfterClass
    public void tearDown(){
        driver.quit();
}
}
