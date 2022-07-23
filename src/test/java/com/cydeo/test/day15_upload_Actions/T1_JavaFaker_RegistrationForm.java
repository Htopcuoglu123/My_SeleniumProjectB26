package com.cydeo.test.day15_upload_Actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_JavaFaker_RegistrationForm {
    @Test
    public void registration_form_test() throws InterruptedException {
        //Note: Use JavaFaker OR read from configuration.properties file when possible.
//    1. Open browser
//    2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

//    3. Enter first name
        Faker faker=new Faker();
        WebElement firstname=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys(faker.name().firstName());
//    4. Enter last name
        WebElement lastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
//    5. Enter username
        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.name().username());
//    6. Enter email address
        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());
//    7. Enter password
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.bothify("???##?##!?##"));
//    8. Enter phone number
        WebElement phoneNum=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNum.sendKeys(faker.numerify("413-###-####"));
//
//    9. Select a gender from radio buttons
        WebElement gender=Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();
//    10.Enter date of birth
        WebElement dateOfBirth=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        dateOfBirth.sendKeys("10/30/1978");
//    11.Select Department/Office
        Select department=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        //department.selectByVisibleText("Department of Engineering");
        department.selectByIndex(faker.number().numberBetween(1,9));
//    12.Select Job Title
        Select jobTitle=new Select(Driver.getDriver().findElement(By.name("job_title")));
        jobTitle.selectByVisibleText("SDET");
       // jobTitle.selectByIndex(faker.number().numberBetween(1,8));
//    13.Select programming language from checkboxes
        WebElement programminLang=Driver.getDriver().findElement(By.id("inlineCheckbox2"));
        programminLang.click();

//    14.Click to sign up button
        WebElement signUp=Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUp.click();
//    15.Verify success message “You’ve successfully completed registration.” is
//    displayed.


        WebElement message=Driver.getDriver().findElement(By.tagName("p"));
        String actualMessage=message.getText();
        String expectedMessage="You’ve successfully completed registration.";
        Thread.sleep(3000);
        Assert.assertEquals(actualMessage,expectedMessage,"Failed");

        Driver.closeDriver();
    }

}
