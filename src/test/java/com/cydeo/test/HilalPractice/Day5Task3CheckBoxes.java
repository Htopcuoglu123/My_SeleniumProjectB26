package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Day5Task3CheckBoxes {
    /*
    Practice: Checkboxes
1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
     */
    @Test
    public void day5Task3CheckBoxes(){
        Driver.getDriver().get("http://practice.cydeo.com/checkboxes");
        WebElement checkBox1=Driver.getDriver().findElement(By.id("box1"));
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        WebElement checkBox2=Driver.getDriver().findElement(By.id("box2"));
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());
        checkBox1.click();
        checkBox2.click();
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());
        Driver.closeDriver();
    }
}
