package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_findElements {
    /*
    TC #4: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
     */
    public static void main(String[] args) {
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/abtest
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);//provides extra time for our
        // driver before it throws NoSuchElementException
        driver.get("https://practice.cydeo.com/abtest");
        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));//we will use find by tagName because all
        // links use tagName as anchor tag.TagName is not good to use for finding only one web element
        // but it is good to use it to find multiple elements
        //By.tagName("a") this will return all the elements that has a(anchor tag) as tag name

        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        //6- Print out the href attribute values of the links

        //getText() is used only for one element, so we need to use a for loop
        // with getText to get the text of each link
        for (WebElement eachLink : allLinks) {
            System.out.println("Text of Each Link = " + eachLink.getText());
            System.out.println("Href values = " + eachLink.getAttribute("href"));
        }
        driver.quit();
    }
}