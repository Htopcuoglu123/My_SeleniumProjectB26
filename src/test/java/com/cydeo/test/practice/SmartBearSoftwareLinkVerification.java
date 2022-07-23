package com.cydeo.test.practice;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearSoftwareLinkVerification extends TestBase {
      //TC #1: Smartbear software link verification
      //1. Open browser
      //2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
      //3. Enter username: “Tester”
      //4. Enter password: “test”
      //5. Click to Login button
      //6. Print out count of all the links on landing page
      //7. Print out each link text on this page
    @Test
    public void smartBearLinkVerification(){
        //2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3. Enter username: “Tester”
//        WebElement userName= driver.findElement(By.id("ctl00_MainContent_username"));
//        userName.sendKeys("Tester");
//        //4. Enter password: “test”
//        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
//        userName.sendKeys("test");
//        //5. Click to Login button
//        WebElement logInBtn=driver.findElement(By.id("ctl00_MainContent_login_button"));
//        logInBtn.click();
        SmartBearUtils.smartBearLogin(driver,"Tester","test");
        //6. Print out count of all the links on landing page
        List<WebElement>allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Number of all links= " + allLinks.size());
        //7. Print out each link text on this page
        for (WebElement eachLink:allLinks) {
            System.out.println(eachLink.getText());
        }
    }
}
