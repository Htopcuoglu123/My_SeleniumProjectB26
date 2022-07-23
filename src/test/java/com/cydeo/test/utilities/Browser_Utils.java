package com.cydeo.test.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Browser_Utils {
    //TC : Create utility method
    //1. Create a new class called BrowserUtils
    //2. Create a method to make Multiple Windows logic re-usable 3. When method is called,
    // it should switch window and verify
    //title.
    //Method info:
    //• Name: switchWindowAndVerify
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedInUrl
    //• Arg3: String expectedTitle

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle) {
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String eachWindowHandle : allWindowHandles) {
            //syntax will switch each window and driver will be able to see each window
            driver.switchTo().window(eachWindowHandle);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        // 5. Assert:Title contains “Etsy”
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title verification failed");

    }

    public static void verifyTitle(WebDriver driver, String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }

    public static void waitForInvisibilityOf(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static List<String> getElementsText(List<WebElement> elements) {
        List<String> elementsText = new ArrayList<>();
        for (WebElement element : elements) {
            elementsText.add(element.getText());
        }
        return elementsText;
    }

    public static List<String> getElementsTextWithStream(List<WebElement> elements) {
        return elements.stream().map(x -> x.getText()).collect(Collectors.toList());
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickAndVerifyRadioBtn(WebDriver driver, String groupName, String buttonName) {
        List<WebElement> radioBtns = new ArrayList<>();
        for (WebElement eachBtn : radioBtns) {
            if (eachBtn.equals(buttonName)) {
                eachBtn.click();
                System.out.println("eachBtn.isSelected() = " + eachBtn.isSelected());
            }
        }
    }
}