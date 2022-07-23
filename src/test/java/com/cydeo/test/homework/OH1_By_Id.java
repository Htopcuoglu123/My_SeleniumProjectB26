package com.cydeo.test.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OH1_By_Id {
    /*

    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com/
    3- Click to Multiple Buttons
    4- Click "Don't Click" button
    5- Verify Result is : "Now it's gone"
     */
    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        //    2- Go to: https://practice.cydeo.com/
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/");
// 3- Click to Multiple Buttons
        WebElement multipleButtons=driver.findElement(By.cssSelector("div#content>ul>li>a[href=\"/multiple_buttons\"]"));
        multipleButtons.click();
//4- Click "Don't Click" button
        WebElement dontClick=driver.findElement(By.cssSelector("button#disappearing_button"));
        dontClick.click();
        //  5- Verify Result is : "Now it's gone"
        WebElement result=driver.findElement(By.cssSelector("p#result"));
        String expectedResult="Now it's gone";
        String actualResult=result.getText();
        System.out.println(result.getText());
        if (expectedResult.equals(actualResult)){
            System.out.println("Result text verification passed");
        }else{
            System.out.println("Result text verification failed");
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
