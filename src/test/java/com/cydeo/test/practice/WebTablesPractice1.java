package com.cydeo.test.practice;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesPractice1 extends TestBase {
    @Test
    public void webTablesTest(){
        driver.get("https://practice.cydeo.com/tables");
        //print out Jason from row and cell number
        WebElement row3Cell2= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("Before clicking row3Cell2.getText() = " + row3Cell2.getText());
        WebElement firstName= driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();
        row3Cell2=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("After clicking row3Cell2 = " + row3Cell2.getText());

        //print out Jason from text
        WebElement jasonCell= driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("jasonCell.getText() = " + jasonCell.getText());

        //print out all cells in row 3
        List<WebElement>allRow3Cells=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        for (WebElement eachCell:allRow3Cells) {
            System.out.println("eachCell.getText() = " + eachCell.getText());

            //print out all cells in row 1
          List<WebElement>allRow1Cells=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]//td"));
            for (WebElement eachRow1Cell:allRow1Cells) {
                System.out.println("eachRow1Cell.getText() = " + eachRow1Cell.getText());
            }
            //print out all cells in row 4
            List<WebElement>allRow4Cells=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[4]//td"));
            for (WebElement eachRow4Cell:allRow4Cells) {
                System.out.println("eachRow4Cell.getText() = " + eachRow4Cell.getText());
            }
            //store all names into list of string
            List<WebElement> allNames=driver.findElements(By.xpath("//table[@id='table1']//td[2]"));
            for (WebElement eachName:allNames) {
                System.out.println("eachName.getText() = " + eachName.getText());
                //store all lastnames
                List<WebElement>allLastNames=driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
                for (WebElement eachLastName:allLastNames) {
                    System.out.println("eachLastName.getText() = " + eachLastName.getText());
                }


            }



        }
    }

}
