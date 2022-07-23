package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4TC3_ForgotPasswordUrlVerification {
    /*
    TC #3: Practice Cydeo/ForgotPassword URL verification
1. Open Chrome browser
2. Go to http://practice.cydeo.com/forgot_password
3. Enter any email into input box
4. Click on Retrieve password
5. Verify URL contains:
Expected: “email_sent”
6. Verify textbox displayed the content as expected.
Expected: “Your e-mail’s been sent!”
     */
    @Test
    public void Day4TC3_ForgotPasswordUrlVerification(){
        Driver.getDriver().get("http://practice.cydeo.com/forgot_password");
        WebElement emailBox=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        WebElement retrievePasswordBtn=Driver.getDriver().findElement(By.cssSelector("button#form_submit"));
        emailBox.sendKeys("john@gmail.com");
        retrievePasswordBtn.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("email_sent"));
        WebElement emailSentText=Driver.getDriver().findElement(By.xpath("//h4[@name='confirmation_message']"));
        Assert.assertEquals(emailSentText.getText(),"Your e-mail's been sent!");
        Driver.closeDriver();


    }

}
