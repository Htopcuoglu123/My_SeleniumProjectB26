package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2Task1_NextBaseCRM {
    /*
    TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
     */
    @Test
    public void  Day2Task1_NextBaseCRM(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        WebElement logInBtn=Driver.getDriver().findElement(By.name("USER_LOGIN"));
        logInBtn.sendKeys("incorrect");
        WebElement passwordBtn=Driver.getDriver().findElement(By.name("USER_PASSWORD"));
        passwordBtn.sendKeys("incorrect");
        WebElement loginBtn=Driver.getDriver().findElement(By.className("login-btn"));
        loginBtn.click();
        WebElement errorMsg=Driver.getDriver().findElement(By.className("errortext"));

        Assert.assertEquals(errorMsg.getText(),"Incorrect login or password");
        Driver.closeDriver();

    }
}
