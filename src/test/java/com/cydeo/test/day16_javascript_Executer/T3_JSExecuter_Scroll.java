package com.cydeo.test.day16_javascript_Executer;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_JSExecuter_Scroll {
    @Test
    public void etsy_scroll_test() throws InterruptedException {

         // Goto Etsy homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));
         //Scroll down

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        //window.scrollBy(x,y); x(right or left) stands for horizontal line and y(up-down)stands for vertical line
        //js.executeScript("window.scrollBy(0,4000)");the pixel number will change depending on the length of the page
        WebElement emailBox=Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
        js.executeScript("arguments[0].scrollIntoView(true)",emailBox);


        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(emailBox).perform();
         // Generate random email and enter into subscribe box
        Faker faker=new Faker();
        emailBox.sendKeys(faker.internet().emailAddress()+ Keys.ENTER);//since we use Keys.ENTER we do not
        // need to hit subscribe anymore
//         // Click on Subscribe
//        WebElement subscribe=Driver.getDriver().findElement(By.xpath("//button[@class='wt-btn wt-input-btn-group__btn']"));
//        subscribe.click();

        //Verify "Great! We've sent you an email to confirm your subscription." is displayed

        Thread.sleep(3000);
        WebElement great=Driver.getDriver().findElement(By.xpath("//div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));
        //Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

        Assert.assertEquals(great.getText(),"Great! We've sent you an email to confirm your subscription.");

        Driver.closeDriver();

    }
}
