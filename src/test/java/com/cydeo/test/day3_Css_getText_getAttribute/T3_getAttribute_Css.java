package com.cydeo.test.day3_Css_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_Css {
    public static void main(String[] args) {
//        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        2- Go to: https://login1.nextbasecrm.com/
        driver.get( "https://login1.nextbasecrm.com/");
//        3- Verify “Log in” button text is as expected:
        //    Expected: Log In
        //located using type attribute
        //WebElement logInButton=driver.findElement(By.cssSelector("input[type='submit']"));

        //located by using onclick attribute
        //WebElement logInButton=driver.findElement(By.cssSelector("input[onclick=\"BX.addClass(this, 'wait');\"]"));

         //located using class attribute
        WebElement logInButton=driver.findElement(By.cssSelector("input[class='login-btn']"));
        String expectedLogInBtText="Log In";
        //since there is no text on the inpect page and value attribute has the same exact text we will use
        //value attribute
        String actualLogInBtText=logInButton.getAttribute("value");
        if(expectedLogInBtText.equals(actualLogInBtText)){
            System.out.println("Log in button text verification passed");
        }else{
            System.out.println("Login button text verification failed");
        }
        driver.quit();



    }
}
