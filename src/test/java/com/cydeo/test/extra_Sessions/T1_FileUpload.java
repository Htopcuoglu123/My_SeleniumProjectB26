package com.cydeo.test.extra_Sessions;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_FileUpload extends TestBase {
    //File Upload ==
    //     Task 1
    //       - Go to  "https://testpages.herokuapp.com/styled/file-upload-test.html"
    //       - Upload file into Choose File
    //             NOTE : Create a file called as UploadTest.txt in project to upload ( I will show how we can )
    //       - Choose General File
    //       - Click Upload button
    //       - Verify Expected message equals "You uploaded a file. This is the result."
@Test
    public void test1(){
    driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");
    WebElement chooseFile=driver.findElement(By.id("fileinput"));
    //locator ->choosefile-> id=fileinput
    String path="C:\\Users\\httop\\IdeaProjects\\SeleniumProjectB26\\src\\test\\resources\\fileUploads\\UploadText.txt";
    chooseFile.sendKeys(path);

    //locator for general file->id=#itsafile
    WebElement generalFile=driver.findElement(By.cssSelector("#itsafile"));
    generalFile.click();

    chooseFile.submit();//this works like clicking the upload button so whenever we have a type=submit and tag name as form
    // we can use submit method

    //locator for uploadBtn-> xpath=//input[@name='upload']
//    WebElement uploadBtn=driver.findElement(By.xpath("//input[@name='upload']"));
//    uploadBtn.click();
    //locator for result->css=.explanation
    String expected="You uploaded a file. This is the result.";
    Assert.assertEquals(driver.findElement(By.cssSelector(".explanation")).getText(),expected);
}
}
