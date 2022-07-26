package com.cydeo.test.day15_upload_Actions;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsClass {
@Test
    public void dragAndDropTest() throws InterruptedException {
    Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
    WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
    WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));
    Actions actions=new Actions(Driver.getDriver());
   // actions.dragAndDrop(smallCircle,bigCircle).perform();
    //or
    actions.moveToElement(smallCircle).pause(1000)
            .clickAndHold().pause(1000)
            .moveToElement(bigCircle).pause(1000)
            .release().perform();

    Assert.assertEquals(bigCircle.getText(),"You did great!");
    Driver.closeDriver();
}

}
