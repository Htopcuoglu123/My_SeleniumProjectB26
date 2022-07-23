package com.cydeo.test.extra_Sessions;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.Browser_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class T2_Actions extends TestBase {
   @Test
    public void test2(){
     //Task 2

       // 	   - Go to  "https://www.globalsqa.com/demo-site/draganddrop/"
       //       - Drag and Drop "High Tatras" and "High Tatras 2" into "Trash"
       //       - Verify Trash has 2 photo
       driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
       WebElement iframe=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
       driver.switchTo().frame(iframe);
       List<WebElement>elements=driver.findElements(By.xpath("//h5[contains(.,'High')]"));
       List<String>elementsText=new ArrayList<>();
       for (WebElement element:elements) {
            elementsText.add(element.getText());
       }
       System.out.println(Browser_Utils.getElementsText(elements));
       System.out.println(Browser_Utils.getElementsTextWithStream(elements));
       WebElement trashCan=driver.findElement(By.id("trash"));
       WebElement highTatras=driver.findElement(By.xpath("//h5[.='High Tatras']"));
       WebElement highTatras2=driver.findElement(By.xpath("//h5[.='High Tatras 2']"));
       actions.dragAndDrop(highTatras,trashCan).perform();
       actions.dragAndDrop(highTatras2,trashCan).perform();
       Browser_Utils.waitFor(3);
       List<WebElement>trashElements=driver.findElements(By.xpath("//div[@id='trash']//li"));
       Assert.assertTrue(trashElements.size()==2);
       //Assert.assertEquals(trashElements.size(),2);

   }
}
