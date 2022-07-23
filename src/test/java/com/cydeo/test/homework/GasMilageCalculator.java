package com.cydeo.test.homework;

import com.cydeo.pages.CalculatorPage;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GasMilageCalculator {
    //Task #: Gas Mileage Calculator Automation Test
    //1. Add a new class GasMileageCalculatorTest
    //2. Go to https://www.calculator.net
    @Test
    public void gasMilageCalculator() throws InterruptedException {
        Driver.getDriver().get("https://www.calculator.net");
        //3. Search for “gas mileage” using search box
        CalculatorPage calculatorPage=new CalculatorPage();
        calculatorPage.searchBox.sendKeys("gas mileage");

        //4. Click on the “Gas Mileage Calculator” link
        calculatorPage.gasMileageLink.click();

        //5. On Next page verify:
        //a. Title equals: “Gas Mileage Calculator”
        Assert.assertEquals(Driver.getDriver().getTitle(),"Gas Mileage Calculator");
        //b. “Gas Mileage Calculator” label is displayed
        Thread.sleep(2000);
        Assert.assertTrue(calculatorPage.label.isDisplayed());
        //6. Locate, clear and type “7925” into “Current odometer” field
        calculatorPage.clearBtn.click();
        calculatorPage.currentodometer.sendKeys("7925");
        //7. Locate, clear and type “7550” into “Previous odometer” field
        calculatorPage.previousOdometer.sendKeys("7550");
        //8. Locate, clear and type “16” into “Gas added” field
        calculatorPage.gas.sendKeys("16");
        //9. Locate, clear and type “3.55” into “Gas price” field
        calculatorPage.gasPrice.sendKeys("3.55");
        //10. Click on Calculate button
        calculatorPage.calculate.click();
        //11. Verify mpg value is as expected:
        //Expected value: “23.44 mpg”
        Assert.assertEquals(calculatorPage.mpgValue.getText(),"23.44 mpg");
        Driver.closeDriver();

    }
}