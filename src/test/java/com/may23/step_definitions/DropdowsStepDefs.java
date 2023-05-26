package com.may23.step_definitions;

import com.may23.pages.Dropdowns;
import com.may23.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdowsStepDefs extends Dropdowns {

   // WebElement dropdownSelection;
    @When("the user clicks on the {string} selection")
    public void theUserClicksOnTheSelection(String dropdownName) {
    dropdownSelectionElement(dropdownName).click();
    }

    @Then("the user sees {int} options to choose from")
    public void theUserSeesOptionsToChooseFrom(int arg0) {
    }



    @Then("the user selects {string}")
    public void theUserSelects(String option) {
        selectOption(getDropdownSelection(), option);
    }

    @When("the user selects Java and C# selection")
    public void theUserSelectsJavaAndCSelection() {
     Select select = new Select(languages);
     select.selectByVisibleText("Java");
     select.selectByVisibleText("C#");
    }

    @Then("Java and C# are selected")
    public void javaAndCAreSelected() {
     String java = "Java";
     String c = "C#";
     Select select = new Select(languages);
     List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

     for (WebElement allSelectedOption : allSelectedOptions) {
      String option = allSelectedOption.getText();
      Assert.assertTrue(option.equals(java)||option.equals(c));
     }

    }

    @When("the user selects {string} website")
    public void theUserSelectsWebsite(String websiteName) {
     websitesButton.click();
     websiteSelection(websiteName).click();
    }

    @Then("the title of the page is {string}")
    public void theTitleOfThePageIs(String websiteName) {
     boolean contains = Driver.getDriver().getTitle().contains(websiteName);
    Assert.assertTrue(contains);
    }
}
