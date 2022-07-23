package com.cydeo.test.practice;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.SmartBearUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartBearOrderPlacing extends TestBase {
    //TC#2: Smartbear software order placing
    //1. Open browser
    //2. Go to website:
    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3. Enter username: “Tester”
    //4. Enter password: “test”
    //5. Click on Login button
    //6. Click on Order
    //7. Select familyAlbum from product, set quantity to 2
    //8. Click to “Calculate” button
    //9. Fill address Info with JavaFaker
    //• Generate: name, street, city, state, zip code
    //10. Click on “visa” radio button
    //11. Generate card number using JavaFaker
    //12. Click on “Process”
    //13. Verify success message “New order has been successfully added.”
    @Test
    public void smartBearOrderPlacing() throws InterruptedException {
        //TC#2: Smartbear software order placing
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //3. Enter username: “Tester”
        //4. Enter password: “test”
        //5. Click on Login button
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");
        SmartBearUtils.smartBearLogin(driver,"Tester","test");
        Thread.sleep(3000);
        //6. Click on Order
        WebElement orderBtn= driver.findElement(By.linkText("Order"));
        orderBtn.click();
        Thread.sleep(3000);
      //  7. Select familyAlbum from product, set quantity to 2
        Select productDropDown=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        productDropDown.selectByVisibleText("FamilyAlbum");

        Thread.sleep(3000);
        WebElement quantityBox=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantityBox.sendKeys("2");
        Thread.sleep(3000);
       // 8. Click to “Calculate” button
        WebElement calculateBtn=driver.findElement(By.xpath("(//input[@class='btn_dark'])[1]"));
        calculateBtn.click();
        //9. Fill address Info with JavaFaker
      //  • Generate: name, street, city, state, zip code
        Thread.sleep(3000);
        Faker faker=new Faker();
        WebElement name=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
        name.sendKeys(faker.name().fullName());
        WebElement street=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        street.sendKeys(faker.address().streetAddress());
        WebElement city=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        city.sendKeys(faker.address().cityName());
        WebElement state=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        state.sendKeys(faker.address().state());
        WebElement zipcode=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        zipcode.sendKeys("20938");
        Thread.sleep(3000);
        //10. Click on “visa” radio button
        WebElement radioBtnVisa=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        radioBtnVisa.click();
        Thread.sleep(3000);
        //11. Generate card number using JavaFaker
        WebElement cardNumberBox=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumberBox.sendKeys(faker.numerify("############"));
        WebElement expireDate=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expireDate.sendKeys("03/25");
        //12. Click on “Process”
        Thread.sleep(3000);
        WebElement process=driver.findElement(By.linkText("Process"));
        process.click();
        Thread.sleep(3000);
        //13. Verify success message “New order has been successfully added.”
        WebElement verifyMsg=driver.findElement(By.xpath("//div[@class='buttons_process']//strong"));
        Assert.assertEquals(verifyMsg.getText(),"New order has been successfully added.");

    }

}
