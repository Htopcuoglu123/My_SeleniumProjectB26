package com.cydeo.test.practice;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class noLinkTexts extends TestBase {
    @Test
    public void getTextOfLinks() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("https://www.openxcell.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        List<String>linkText=new ArrayList<>();
        for (int i = 0; i <allLinks.size() ; i++) {
            try {linkText.add(allLinks.get(i).getText());
            }catch (Exception e){
                System.out.println(e.getMessage());}
        }
        int hasTextCount=0;
        for (int i = 0; i <linkText.size() ; i++) {
            if(!linkText.get(i).isBlank()&&!linkText.get(i).isEmpty()&&linkText.get(i)!=null){
                System.out.println(linkText.get(i));
                hasTextCount++;
            }}
        int noLinkText= allLinks.size()-hasTextCount;
        System.out.println("Number of links which have visible text " + hasTextCount + ".");
        System.out.println("noLinkText = " + noLinkText);
//Result: Number of links which have visible text 95.
//One broken link so far - stale element reference: element is not attached to the page document
    }
}

