package com.cydeo.test.day9_iFrame;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IFramePractice extends TestBase {
    @Test
    public void iFrameTest() throws InterruptedException {
        //2- Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

        //NoSuchElementException comes with reasons:1-not locating the element correctly
                                                //  2-there is an iframe, and you need to switch to frame
        //  to reach this element

       // We can use frame(id) method with id arg
        driver.switchTo().frame("mce_0_ifr");

        //We can use frame(locator)
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //We can use frame(index):index starts from 0
        //we can find iframe tags from html by searching in the "find"  by xpath "//iframe" and it will show us the number of iframes.
        // if there are 3 we can use 2 as index since index nums start from 0
       // driver.switchTo().frame(0);//since there is only one it will be 0.

        //3- Clear text from comment body
        WebElement commentBody= driver.findElement(By.id("tinymce"));
        commentBody.clear();//clear method() will delete text from comment body
        Thread.sleep(2000);


        //4- Type "Hello World" in comment body
        commentBody.sendKeys("Hello World");
        //5- Verify "Hello World" text is written in comment body
        assertEquals(commentBody.getText(),"Hello World");
        //if you have nested frame and if you want to switch 1 frame to direct parent of this frame
        driver.switchTo().parentFrame();
        //defaultContent() method will switch to main html(parent of all HTML)
        //driver.switchTo().defaultContent()

        //6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
        WebElement headerText=driver.findElement(By.tagName("h3"));
        assertTrue(headerText.isDisplayed(),"Header Text is not displayed");//for assertTrue only one
        // argument will be enough

        String actualHeaderText=headerText.getText();
        String expectedHeaderText="An iFrame containing the TinyMCE WYSIWYG Editor";
        assertEquals(actualHeaderText,expectedHeaderText,"Header Text is not displayed");

        }

}
