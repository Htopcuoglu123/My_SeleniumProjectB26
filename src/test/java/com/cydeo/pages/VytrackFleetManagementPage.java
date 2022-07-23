package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackFleetManagementPage {
    public VytrackFleetManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='unclickable'])[1]")
    WebElement fleet;

    @FindBy(xpath = "//span[.='Vehicle Odometer']")
    WebElement VehicleOdometer;
}
