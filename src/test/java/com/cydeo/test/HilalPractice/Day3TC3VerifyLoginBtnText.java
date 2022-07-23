package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3TC3VerifyLoginBtnText {
    /*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Login
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from

     */
    @Test
    public void Day3TC1(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        WebElement logInBtnText=Driver.getDriver().findElement(By.cssSelector("input[name='USER_LOGIN']"));
        Assert.assertEquals(logInBtnText.getAttribute("placeholder"),"Login");
        Driver.closeDriver();

    }
}
