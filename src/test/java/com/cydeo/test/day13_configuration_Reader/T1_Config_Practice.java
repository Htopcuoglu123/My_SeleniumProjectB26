package com.cydeo.test.day13_configuration_Reader;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Config_Practice extends TestBase {
    @Test
    public void login_crm_app(){
        //1. Create new test and make setups
        //2. Go to : http://login1.nextbasecrm.com/
       // driver.get("http://login1.nextbasecrm.com/");//Hardcoded way
        driver.get(ConfigurationReader.getProperty("env"));//done by using ConfigurationReader class
        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//        inputUsername.sendKeys("hr1@cydeo.com");
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        //inputPassword.sendKeys("UserUser");
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal
       // Browser_Utils.verifyTitle(driver,"(11) Portal");
    }
}
