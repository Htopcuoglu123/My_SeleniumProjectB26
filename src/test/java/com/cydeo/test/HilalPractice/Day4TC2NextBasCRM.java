package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4TC2NextBasCRM {
    /*
    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: FORGOT YOUR PASSWORD?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
PS: Inspect and decide which locator you should be using to locate web
elements.
     */
    @Test
    public void Day4TC2NextBasCRM(){
        Driver.getDriver().get("https://login1.nextbasecrm.com/");
        WebElement rememberMeText=Driver.getDriver().findElement(By.xpath("//label[.='Remember me on this computer']"));
        Assert.assertEquals(rememberMeText.getText(),"Remember me on this computer");
        WebElement forgotPsw=Driver.getDriver().findElement(By.xpath("//a[@class='login-link-forgot-pass']"));
        Assert.assertEquals(forgotPsw.getText(),"FORGOT YOUR PASSWORD?");
        Assert.assertTrue(forgotPsw.getAttribute("href").contains("forgot_password=yes"));
        Driver.closeDriver();
    }
}
