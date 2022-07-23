package com.cydeo.test.HilalPractice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Day5TC_Tesla {
    /*
    TC #1: Tesla “Solar Panel” header verification
1. Open a Chrome browser
2. Go to: https://www.tesla.com
3. Locate Solar Panels header
4. Verify if it is displayed on the page
     */
    @Test
    public void day5TC_Tesla(){
        Driver.getDriver().get("https://www.tesla.com");
        WebElement solarPanelsHeader=Driver.getDriver().findElement(By.xpath("(//h1[contains(text(),'Solar Panels')])[1]"));
        System.out.println("solarPanelsHeader.isDisplayed() = " + solarPanelsHeader.isDisplayed());
        Driver.closeDriver();
    }
}
