package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_04_NegativeTest {
    /*
    Given I am on NextBaseCRM Login page
   Verify the Authorization header is displayed
When I enter invalid hr username
And I enter invalid hr password
And I click the login button
Then I should see a message "Incorrect login or password"
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
// Navigate to NextBaseCRM Login page
        driver.get("http://login2.nextbasecrm.com/");
        Thread.sleep(2000);
        WebElement headerText=driver.findElement(By.cssSelector("div.log-popup-header"));
        String expectedHeaderText="Authorization";
        String actualHeaderText=headerText.getText();
        Thread.sleep(2000);
        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header Test verification passed");
        }else{
            System.out.println("Header Test verification failed");
        }
        //  enter invalid hr username
        WebElement invalidUserName1=driver.findElement(By.name("USER_LOGIN"));
        invalidUserName1.sendKeys("hr@cybertekschool.com");
        Thread.sleep(2000);
        //enter invalid hr password
        WebElement invalidPassword=driver.findElement(By.name("USER_PASSWORD"));
        invalidPassword.sendKeys("Usdgfiudshf");
        Thread.sleep(2000);
        // click the login button
        WebElement loginButton=driver.findElement(By.className("login-btn"));
        loginButton.click();
        //see a message "Incorrect login or password"
        WebElement message=driver.findElement(By.className("errortext"));
        String expectedMsg="Incorrect login or password";
        String actualMsg=message.getText();
        if(expectedMsg.equals(actualMsg)){
            System.out.println("Invalid username and invalid password verification test passed");
        }else{
            System.out.println("Invalid username and invalid password verification test failed");
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
