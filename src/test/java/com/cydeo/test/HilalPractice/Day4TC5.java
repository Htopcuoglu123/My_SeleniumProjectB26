package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4TC5 {
    /*
    TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
     */
    @Test
    public void Day4TC5(){
        Driver.getDriver().get("https://login1.nextbasecrm.com/?forgot_password=yes");
        WebElement loginBox=Driver.getDriver().findElement(By.name("USER_LOGIN"));
        loginBox.sendKeys("incorrect"+ Keys.ENTER);
        WebElement errortext=Driver.getDriver().findElement(By.xpath("//div[@class='errortext']"));
        Assert.assertEquals(errortext.getText(),"Login or E-mail not found");
        Driver.closeDriver();

    }
}
