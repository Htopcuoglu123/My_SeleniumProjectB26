package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_StaleElementRefException {
    public static void main(String[] args) {

        // TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/add_remove_elements/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        WebElement addElementBtn= driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementBtn.click();

        //4. Verify “Delete” button is displayed after clicking.
        WebElement deletebtn=driver.findElement(By.cssSelector("button[class='added-manually']"));
        System.out.println("Before clicking delete button = " + deletebtn.isDisplayed());

        //5. Click to “Delete” button.
        deletebtn.click();

        //6. Verify “Delete” button is NOT displayed after clicking.


        try{
            System.out.println("After clicking delete button = " + deletebtn.isDisplayed());
        }catch(StaleElementReferenceException e){
            System.out.println("Stale element exception os thrown");
            System.out.println("This means the web element is completely deleted from the page and HTML");
        }

        driver.quit();

    }
}
