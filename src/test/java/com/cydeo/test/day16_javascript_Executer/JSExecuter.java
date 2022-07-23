package com.cydeo.test.day16_javascript_Executer;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecuter {
    @Test
    public void jSExecuter() throws InterruptedException {
        Driver.getDriver().get("https://practice.cydeo.com/");
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);"+"arguments[0].click()",cydeoLink);
        Thread.sleep(2000);

    }
}
