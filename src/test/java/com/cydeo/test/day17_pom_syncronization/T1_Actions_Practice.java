package com.cydeo.test.day17_pom_syncronization;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Actions_Practice {
    @Test
    public void cydeo_practice_drag_and_drop_test(){
      //1. Open a chrome browser
        //2. Go to:
        //https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoDragAndDrop.url"));
        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCirle=Driver.getDriver().findElement(By.id("droptarget"));
        //3. Click and hold small circle
        //4. Move it on top of the big circle
        //5. And release on it.
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCirle).perform();
        //or use the longer way
//        actions.moveToElement(smallCircle)
//                .clickAndHold()
//                .moveToElement(bigCirle)
//                .release().perform();

        //6. Verify “You did great!” text appears on big circle

        Assert.assertEquals(bigCirle.getText(),"You did great!");
        Driver.closeDriver();
    }
}
