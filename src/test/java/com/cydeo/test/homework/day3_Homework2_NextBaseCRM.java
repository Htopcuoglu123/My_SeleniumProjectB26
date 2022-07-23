package com.cydeo.test.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day3_Homework2_NextBaseCRM {

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
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            //1- Open a chrome browser
            //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
            driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
            Thread.sleep(2000);
            //3- Enter incorrect username into login box:
            WebElement login= driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
            login.sendKeys("abcd12");
            //4- Click to `Reset password` button
            WebElement resetPswButton=driver.findElement(By.cssSelector("button.login-btn"));
            resetPswButton.click();
            //5- Verify “error” label is as expected
            //Expected: Login or E-mail not found
            WebElement errorMsg=driver.findElement(By.cssSelector("div.errortext"));
            String expectedMsg="Login or E-mail not found";
            String actualMsg=errorMsg.getText();
            if (actualMsg.equals(expectedMsg)) {
                System.out.println("Error message verification passed");
            }else{
                System.out.println("Error message verification failed");
            }
            Thread.sleep(2000);
            driver.close();
    }
}
