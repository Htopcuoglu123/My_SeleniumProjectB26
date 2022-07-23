package com.cydeo.test.homework;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload_Practice_Homework {
    @Test
    public void fileUpload_Practice_Homework() throws InterruptedException {
//        TC #2 Upload Test
//        1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoFileUpload_url"));
//        2. Find some small file from your computer, and get the path of it.
//        3. Upload the file.
        WebElement chooseFileBtn=Driver.getDriver().findElement(By.id("file-upload"));
        chooseFileBtn.sendKeys("C:\\Users\\httop\\Downloads\\some-file.txt");
        WebElement uploadBtn=Driver.getDriver().findElement(By.id("file-submit"));
        uploadBtn.click();
        Thread.sleep(3000);
//        4. Assert:
//        -File uploaded text is displayed on the page
        WebElement fileUploadtext=Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertEquals(fileUploadtext.getText(),"File Uploaded!","Text is not displayed correctly");
        Assert.assertTrue(fileUploadtext.isDisplayed());
        Driver.closeDriver();
    }
}
