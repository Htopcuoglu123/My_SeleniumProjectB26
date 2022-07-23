package com.cydeo.test.practice;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrames_Practice extends TestBase {
    //TC : Iframe practice
    //1. Go to: https://practice.cydeo.com/iframe
    //2. Assert: “Your content goes here.” Text is displayed.
    //3. Assert: “An iFrame containing the TinyMCE
    //WYSIWYG Editor”
    //
    @Test
    public void iframeTest(){
        driver.get("https://practice.cydeo.com/iframe");
//        WebElement iframe= driver.findElement(By.id("mce_0_ifr"));//switch by locating it as a webElement
//        driver.switchTo().frame(iframe);
//
//      driver.switchTo().frame(0);//by index number
        driver.switchTo().frame("mce_0_ifr");//switch by id-name or value
        WebElement textArea=driver.findElement(By.tagName("p"));
        Assert.assertTrue(textArea.isDisplayed());
        driver.switchTo().parentFrame();
    }
    public void iFramePractice2(){
        driver.switchTo().frame("mce_0_ifr");
        WebElement textContent= driver.findElement(By.tagName("p"));
        String expectedTextContent="Your content goes here.";
        String actualContent=textContent.getText();
        Assert.assertEquals(actualContent,expectedTextContent,"Text is not displayed correctly");
        driver.switchTo().parentFrame();
        WebElement title= driver.findElement(By.tagName("h3"));
        title.getText();
        Assert.assertEquals(title.getText(),"An iFrame containing the TinyMCE \n" +
                "    //WYSIWYG Editor");
    }
}
