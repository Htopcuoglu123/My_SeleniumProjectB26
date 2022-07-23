package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoftSkillsPositiveTest {
    public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("http://login2.nextbasecrm.com/");
            Thread.sleep(2000);
        WebElement headerText=driver.findElement(By.cssSelector("div.log-popup-header"));
        String expectedHeaderText="Authorization";
        String actualHeaderText=headerText.getText();
        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header Text verification passed");
        }else{
            System.out.println("Header Text verification failed");
        }

        WebElement validUserName=driver.findElement(By.name("USER_LOGIN"));
        validUserName.sendKeys("helpdesk60@cybertekschool.com");
        Thread.sleep(2000);
        WebElement validPassword=driver.findElement(By.name("USER_PASSWORD"));
        validPassword.sendKeys("UserUser");
        WebElement loginButton=driver.findElement(By.className("login-btn"));
        loginButton.click();

        String expectedTitle = "(54) Portal";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("LogIn title verification passed");
        } else {
            System.out.println("Failed");
        }
        Thread.sleep(2000);
        driver.quit();


    }
}
