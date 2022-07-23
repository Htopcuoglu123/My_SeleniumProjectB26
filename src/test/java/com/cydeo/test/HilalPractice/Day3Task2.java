package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3Task2 {
    /*
    TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
  Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
  Expected: first name
     */
    @Test
    public void day3Task2(){
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        WebElement headerText=Driver.getDriver().findElement(By.className("page-header"));
        Assert.assertEquals(headerText.getText(),"Registration form","HeaderText is not displayed correctly");

        WebElement firstNameBox=Driver.getDriver().findElement(By.name("firstname"));
        Assert.assertEquals(firstNameBox.getAttribute("placeholder"),"first name");

        Driver.closeDriver();

    }
}
