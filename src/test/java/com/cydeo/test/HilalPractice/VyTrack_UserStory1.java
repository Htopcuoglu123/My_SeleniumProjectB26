package com.cydeo.test.HilalPractice;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.Browser_Utils;
import com.cydeo.test.utilities.VyTrack_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VyTrack_UserStory1 extends TestBase{

        @Test
        public void testingUserStory1() throws InterruptedException {

            // 1- Open website / Go to login page
            driver.get("https://qa2.vytrack.com/user/login");

            // 2- Verify "Login" header is displayed

            WebElement loginButton = driver.findElement(By.xpath("//h2[.='Login']"));

            Assert.assertEquals(loginButton.getText(), "Login","Header verification is failed!");

            // 3 - Enter valid username
            // 4 -Enter valid password
            // 5 -Click log in button -> using Utilities method

           VyTrack_Utilities.VyTrack_Login(driver,"user186", "UserUser123");


            // 6 - A truck driver should be logged in/ be on the homepage, title of homepage is "Dashboard" -> using Utilities method

            Thread.sleep(3000);//wait to load the homepage

            Browser_Utils.verifyTitle(driver, "Dashboard");

            // 7 - A truck driver should be able to click Vehicles under Fleet module dropdown and see title of page "Car - Entities - System - Car - Entities - System", "Cars" header, grid information items, and a list of cars displayed under the grid.

            //click Fleet
            WebElement fleetButton = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));

            fleetButton.click();

            //click Vehicles
            WebElement vehiclesButton = driver.findElement(By.xpath("//span[.='Vehicles']"));

            vehiclesButton.click();

            //verify title of the page

            Thread.sleep(3000);
            Browser_Utils.verifyTitle(driver, "Car - Entities - System - Car - Entities - System");

            //verify header
            WebElement carHeader = driver.findElement(By.className("oro-subtitle"));

            Assert.assertEquals(carHeader.getText(), "Cars","Header verification failed!");



            // 8 -Truck driver should be able to click on any car on the grid and see the following information about the car: General, Activity

            WebElement firstCarLicensePlate =
                    driver.findElement(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']//td[.='12324124']"));

            firstCarLicensePlate.click();

            //confirm General item on grid

            WebElement general = driver.findElement(By.linkText("General"));

            Assert.assertEquals(general.getText(), "General","'General' header item verification failed!");

            //confirm Activity item on grid

            WebElement activity = driver.findElement(By.linkText("Activity"));

            Assert.assertEquals(activity.getText(), "Activity","'Activity' header item verification failed!");


            // 9 - A truck driver should be able to add event to the log by clicking the "Add Event" button
            //and see a new window appeared with header "Add Event" and containing items like Title, Description, Start, End, etc. with the empty input fields

            WebElement addEventButton = driver.findElement(By.xpath("//a[@class='btn icons-holder-text no-hash']"));
            addEventButton.click();

            Thread.sleep(3000);

            //confirm header Add Event

            WebElement addEventHeaderPopup = driver.findElement(By.xpath("//span[@id='ui-id-2']"));

            Assert.assertEquals(addEventHeaderPopup.getText(), "Add Event", "Header 'Add event' verification failed!");

            //confirm Title
            Thread.sleep(2000);

            WebElement titleAddEvent = driver.findElement(By.xpath("(//label[@class='required'])[1]"));

            Assert.assertEquals(titleAddEvent.getText(), "Title*", "'Title*' item under Add Event verification failed!");

            //locate input box and write title "Renew licence plates"

            Thread.sleep(2000);
            WebElement inputBoxEventTitle = driver.findElement(By.xpath("(//input[starts-with(@id,'oro_calendar_event_form')])[1]"));

            inputBoxEventTitle.sendKeys("Renew license plates");

            //click SAVE

            Thread.sleep(2000);

            WebElement saveEventButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
            saveEventButton.click();

            // 10 - A truck driver should be able to change the grid on Cars page by clicking Grid setting button and choosing an item from the dropdown menu

            //go back by clicking Car on top

            WebElement clickCarButton = driver.findElement(By.xpath("//a[.='Car']"));

            clickCarButton.click();

            //click grid setting button
            Thread.sleep(2000);

            WebElement gridSettingsButton = driver.findElement(By.xpath("//a[@title='Grid Settings']"));

            gridSettingsButton.click();

            //make changes by clicking ID check cell

            Thread.sleep(2000);
            WebElement checkCellID = driver.findElement(By.xpath("(//table[@class='grid table-hover table table-condensed']//input[starts-with(@id,'column')])[1]"));

            checkCellID.click();

            System.out.println("checkCellID.isSelected() = " + checkCellID.isSelected());

            Thread.sleep(2000);
            gridSettingsButton.click(); //to get rid of grid settings table

            // 11 -A truck driver should be able to reset the grid by clicking reset button and to see previous changes on the Grid dissapeared

            //find reset button and click

            Thread.sleep(2000);
            WebElement resetGridButton = driver.findElement(By.xpath("//a[@title='Reset']"));

            resetGridButton.click();


            //confirm ID is not selected after RESET

            Thread.sleep(2000);
            gridSettingsButton.click();

            Thread.sleep(2000);
            System.out.println("checkCellID.isSelected() = " + checkCellID.isSelected());   //false


        }




    }

