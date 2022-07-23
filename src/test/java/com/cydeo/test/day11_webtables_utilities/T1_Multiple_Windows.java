package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.Browser_Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_Multiple_Windows extends TestBase {


@Test
    public void windowsHandleTest(){
    //2. Goto:https://www.amazon.com/
    driver.get("https://www.amazon.com");
    //3. Copy paste the lines from below into your class
    //"_blank" will open url in a new tab
    ((JavascriptExecutor) driver).executeScript("window.open('https://google.com/','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com/','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

    //4. Create a logic to switch to the tab where Etsy.com is open
    //We store all windows on set of String with using getWindowHandles() method
    Set<String> allWindowHandles=driver.getWindowHandles();
     for (String eachWindowHandle : allWindowHandles) {
       //syntax will switch each window and driver will be able to see each window
        driver.switchTo().window(eachWindowHandle);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());//optional, use only if you want to print the url

        if(driver.getCurrentUrl().contains("etsy")){
            break;
        }
    }
//    // 5. Assert:Title contains “Etsy”
//    String actualTitle=driver.getTitle();
//    String expectedTitle="Etsy";
//    Assert.assertTrue(actualTitle.contains(expectedTitle),"Title verification failed");
//
    //instead of using all the u\lines above we are just calling the method by using the class name
    Browser_Utils.switchWindowAndVerify(driver,"etsy","Etsy");
}
}
