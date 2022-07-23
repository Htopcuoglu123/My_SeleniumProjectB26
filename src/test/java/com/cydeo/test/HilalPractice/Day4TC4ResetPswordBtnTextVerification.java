package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4TC4ResetPswordBtnTextVerification {
    /*
    TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password

PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
     */
    @Test
    public void Day4TC4ResetPswordBtnTextVerification(){
        Driver.getDriver().get("https://login1.nextbasecrm.com/?forgot_password=yes");
        WebElement resetPswBtn=Driver.getDriver().findElement(By.className("login-btn"));
        Assert.assertEquals(resetPswBtn.getText(),"Reset password");
        Driver.closeDriver();

    }
}
