package com.cydeo.test.practice;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablePractice extends TestBase {
@Test
//    TC #1: Web table practice
//    1. Go to: https://practice.cydeo.com/web-tables
    public void verifyBob(){
    driver.get(" https://practice.cydeo.com/web-tables");
    //    2. Verify Bob’s name is listed as expected.
    //    Expected: “Bob Martin”
    WebElement bobsName= driver.findElement(By.xpath("//table[@class='SampleTable']//tr[7]//td[.='Bob Martin']"));
    Assert.assertEquals(bobsName.getText(),"Bob Martin","Name not listed correctly");

//    3. Verify Bob Martin’s order date is as expected
//    Expected: 12/31/2021
    WebElement orderDate= driver.findElement(By.xpath("//table[@class='SampleTable']//tr[7]//td[.='12/31/2021']"));
    //WebElement orderDate1= driver.findElement(By.xpath("//table[@class='SampleTable']//tr[7]//td[5]"));
    String actualOrderDate=orderDate.getText();
    String expectedOrderDate="12/31/2021";
    Assert.assertEquals(actualOrderDate,expectedOrderDate,"Order date is not displayed correctly");



}




}
