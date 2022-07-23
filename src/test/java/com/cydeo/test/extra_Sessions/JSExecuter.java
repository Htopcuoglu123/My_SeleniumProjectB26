package com.cydeo.test.extra_Sessions;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.Browser_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecuter extends TestBase {
  //  Task 1

    //Go to "https://techcrunch.com/"
    //Click TechCrunch from footer>About>TechCrunch
    //Verify title contains "TechCrunch"
@Test
    public void test1(){
    driver.get("https://techcrunch.com/");
    WebElement testCrunch= driver.findElement(By.xpath("//a[@data-ga-event-label='TechCrunch']"));
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)",testCrunch);
    Browser_Utils.waitFor(5);
    testCrunch.click();
}



}
