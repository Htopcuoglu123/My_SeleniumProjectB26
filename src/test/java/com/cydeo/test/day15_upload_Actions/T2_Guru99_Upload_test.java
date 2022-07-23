package com.cydeo.test.day15_upload_Actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_test {
   @Test
   public void upload_File_Test(){
   //    1. Go to “http://demo.guru99.com/test/upload”
      Driver.getDriver().get(ConfigurationReader.getProperty("guru99.upload.url"));
//    2. Upload file into Choose File
      WebElement chooseFile=Driver.getDriver().findElement(By.id("uploadfile_0"));
      //We do not click on choose file element because it will open out of browser window which is coming from machine and selenium
      //cannot handle it. That's why after we locate chooseFile element we  just send keys method to send path
     // String path="C:\\Users\\httop\\Downloads\\some-file.txt";//we will not use this way
      chooseFile.sendKeys("C:\\Users\\httop\\Downloads\\some-file.txt");
//    3. Click terms of service checkbox
      WebElement idTerms=Driver.getDriver().findElement(By.id("terms"));
      idTerms.click();
//    4. Click Submit File button
      WebElement submitFileBtn=Driver.getDriver().findElement(By.id("submitbutton"));
      submitFileBtn.click();
//    5. Verify expected message appeared.
//    Expected: “1 file
//    has been successfully uploaded.”
      WebElement resultMessage=Driver.getDriver().findElement(By.id("res"));
     String actualResult=resultMessage.getText();
     String expectedResult="1 file\nhas been successfully uploaded.";
      Assert.assertEquals(actualResult,expectedResult);
      Driver.closeDriver();
   }
}
