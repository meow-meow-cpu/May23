package com.may23.pages;

import com.may23.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateTo(String page) {
        WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//*[contains(text(), '"+page+"')]"));
        linkToPage.click();
    }
}
