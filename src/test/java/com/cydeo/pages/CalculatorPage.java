package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    @FindBy(id="calcSearchTerm")
    public WebElement searchBox;
    @FindBy(partialLinkText = "Gas Mileage Calculator")
    public WebElement gasMileageLink;
    @FindBy(xpath = "//iframe[@style='visibility: hidden; display: none;']")
    public WebElement iframe;
    @FindBy(xpath = "//h1[.='Gas Mileage Calculator']")
    public WebElement label;

    @FindBy(className = "clearbtn")
    public WebElement clearBtn;

    @FindBy(id="uscodreading")
    public WebElement currentodometer;

    @FindBy(id="uspodreading")
    public WebElement previousOdometer;

    @FindBy(id="usgasputin")
    public WebElement gas;

    @FindBy(id="usgasprice")
    public WebElement gasPrice;

    @FindBy(xpath = "(//input[@value='Calculate'])[1]")
    public WebElement calculate;

    @FindBy(xpath = "//b[.='23.44 mpg']")
    public WebElement mpgValue;







    public CalculatorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}

