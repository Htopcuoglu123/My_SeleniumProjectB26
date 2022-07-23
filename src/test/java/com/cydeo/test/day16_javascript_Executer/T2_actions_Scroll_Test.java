package com.cydeo.test.day16_javascript_Executer;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T2_actions_Scroll_Test {
    @Test
    public void actions_Scroll_Test(){

        //    1- Open a chrome browser
        //    2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get(ConfigurationReader.getProperty("practicePage_url"));
        //    3- Scroll down to “Powered by CYDEO”
        WebElement cydeo=Driver.getDriver().findElement(By.linkText("CYDEO"));
        //    4- Scroll using Actions class “moveTo(element)” method
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(cydeo).perform();

        //    1- Continue from where the Task 4 is left in the same test.
        //    2- Scroll back up to “Home” link using PageUP button

        //There are 2 ways to do scrolling in Actions class
        //1-moveToElement(target element)
        //2-Keys.PAGE_UP and keys.PAGE_DOWN
        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));
        //actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        //if we do Keys.PAGE_UP once it is only one scrolling up so it goes only up to the half way of the page, thats
        //why we do not prefer to use it
        actions.moveToElement(homeLink).perform();

    }
}
