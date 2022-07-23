package com.cydeo.test.day18_review;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecuterScrollPage {
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/infinite_scroll
    //3- Use below JavaScript method and scroll
    //a.  750 pixels down 10 times.
    //b.  750 pixels up 10 times
    @Test
    public void js_executer_Scroll_Page(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        //3- Use below JavaScript method and scroll
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy(0,7500)");
    }
}
