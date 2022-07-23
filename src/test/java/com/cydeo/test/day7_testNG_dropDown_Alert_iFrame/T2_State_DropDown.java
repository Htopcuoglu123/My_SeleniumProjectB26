package com.cydeo.test.day7_testNG_dropDown_Alert_iFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_State_DropDown {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        // 1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void stateDropDownTest(){
        Select stateDropDown=new Select(driver.findElement(By.id("state")));
        System.out.println("stateDropDown.isMultiple() = " + stateDropDown.isMultiple());
        //3. Select Illinois
        stateDropDown.selectByValue("IL");

        //4. Select Virginia
        stateDropDown.selectByVisibleText("Virginia");

        //5. Select California
        stateDropDown.selectByIndex(5);

        //6. Verify final selected option is California.
       String actualFinalSelectedOpt=stateDropDown.getFirstSelectedOption().getText();
       //getFirstSelectedOption()-> returns current selected option
        //getFirstSelectedOption() returns webElement so to get it as a string we use .getText() method
       String expectedFinalSelectedOpt="California";
       Assert.assertEquals(actualFinalSelectedOpt,expectedFinalSelectedOpt,"Test failed");
        //Use all Select options. (visible text, value, index)

       // Assert.assertEquals(stateDropDown.getFirstSelectedOption().getText(),"California","Test failed");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    /*
    1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown

4. Print out all selected values.


     */
    @Test
    public void multipleSelectDropDownTest(){
      //3. Select all the options from multiple select dropdown.
        Select languages=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        //isMultiple() method will check if we have multiple select option
        System.out.println("languages.isMultiple() = " + languages.isMultiple());

//        languages.selectByValue("java");
//        languages.selectByVisibleText("C#");
//        languages.selectByIndex(3);

        //4. Print out all selected values.
        //getOptions() method will return all options in dropDown

        List<WebElement>allOptions=languages.getOptions();
        for (WebElement each:allOptions) {
            each.click();//to be able to do multiple selections we need to click each option
            System.out.println("each.getText() = " + each.getText());
        }
      //5. Deselect all values.
        languages.deselectAll();
    }

}
