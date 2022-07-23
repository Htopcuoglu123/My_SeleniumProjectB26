package com.cydeo.test.extra_Sessions;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions extends TestBase {
   @Test
    public void test3(){

       //     Task 3
       //	   - Go to  "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx"
       //       - Fill form with following information
       //		fullname : TEST
       //		email    : TEST
       //	   - Click Login Button
       //	   - Verify error message equals "Invalid Login or Password."
       driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
       WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
       actions.click(username)
               .keyDown(Keys.SHIFT)
               .sendKeys("test")
               .keyUp(Keys.SHIFT)
               .perform();
       WebElement email=driver.findElement(By.id("ctl00_MainContent_password"));
       actions.click(email)
               .keyDown(Keys.SHIFT)
               .sendKeys("test")
               .keyUp(Keys.SHIFT)
               .perform();
       WebElement login= driver.findElement(By.cssSelector("#ctl00_MainContent_login_button"));
       login.click();
       WebElement errorMsg= driver.findElement(By.xpath("//span[.='Invalid Login or Password.']"));
       Assert.assertEquals(errorMsg.getText(),"Invalid Login or Password.");
    }

}
