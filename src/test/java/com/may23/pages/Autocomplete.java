package com.may23.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Autocomplete extends BasePage {

    @FindBy(id = "myCountry")
    public WebElement inputWindow;

    @FindBy(xpath = "//div/input[@value]")
    public WebElement countryNames;
}
