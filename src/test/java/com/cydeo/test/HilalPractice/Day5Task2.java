package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Day5Task2 {
    /*
    TC #4: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
     */
    @Test
    public void Day5Task2(){
        Driver.getDriver().get("https://practice.cydeo.com/abtest");
        List<WebElement>allLinks=Driver.getDriver().findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());
        for (WebElement eachLink: allLinks) {
            System.out.println("eachLink.getText() = " + eachLink.getText());
            System.out.println("eachLink.getAttribute(\"href\") = " + eachLink.getAttribute("href"));
        }

    }
}
