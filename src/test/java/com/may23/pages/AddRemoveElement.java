package com.may23.pages;

import com.may23.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElement extends BasePage {

    public WebElement findButton(String buttonName){
        WebElement button = Driver.getDriver().findElement(By.xpath("//*[contains(text(), '"+buttonName+"')]"));
        return button;
        //button.click();
    }
}
