package com.may23.step_definitions;

import com.may23.pages.AddRemoveElement;
import com.may23.pages.BasePage;
import com.may23.utilities.BrowserUtils;
import com.may23.utilities.ConfigurationReader;
import com.may23.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddRemoveElementStepDefs extends AddRemoveElement {

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
    }

    @Then("the user clicks on the {string} module")
    public void theUserClicksOnTheModule(String moduleName) {
    navigateTo(moduleName);
    }

    @And("the user clicks {string} button")
    public void theUserClicksButton(String buttonName) {
        findButton(buttonName).click();
    }

    @Then("the user verifies that {string} button appeared")
    public void theUserVerifiesThatButtonAppeared(String buttonName) {
        Assert.assertTrue(findButton(buttonName).isDisplayed());
    }


    @Then("the user verifies that {string} button disappears")
    public void theUserVerifiesThatButtonDisappears(String buttonName) {
        Assert.assertFalse(findButton(buttonName).isDisplayed());
    }
}
