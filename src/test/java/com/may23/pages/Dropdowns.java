package com.may23.pages;

import com.may23.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns extends BasePage {

    //method to find dropdowns

    WebElement dropdownSelection;

    public WebElement getDropdownSelection() {
        return dropdownSelection;
    }

    public WebElement dropdownSelectionElement (String dropdownName){
        WebElement dropdownSelection = Driver.getDriver().findElement(By.id(dropdownName));
        this.dropdownSelection = dropdownSelection;
        return dropdownSelection;
    }

    public void selectOption(WebElement dropdownSelection, String option){
        Select select = new Select(dropdownSelection);
        select.selectByVisibleText(option);
    }

    @FindBy(name = "Languages")
    public WebElement languages;

    @FindBy(id = "dropdownMenuLink")
    public WebElement websitesButton;

    public WebElement websiteSelection(String websiteName){
    WebElement website = Driver.getDriver().findElement(By.partialLinkText(websiteName));
    return website;
    }

}
