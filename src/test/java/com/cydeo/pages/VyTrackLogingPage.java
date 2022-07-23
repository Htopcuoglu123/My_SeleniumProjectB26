package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLogingPage {
    public VyTrackLogingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(id="_submit")
    public WebElement submitBtn;

}
