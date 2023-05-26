package com.may23.step_definitions;

import com.may23.pages.Autocomplete;
import com.may23.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AutocompleteStepDefs extends Autocomplete {

    @And("the user starts typing {string} in country entry field")
    public void theUserStartsTypingInCountryEntryField(String letters) {
        inputWindow.sendKeys(letters);
    }

    @Then("the user sees suggestions that start with {string} in the field below")
    public void theUserSeesSuggestionsThatStartWithInTheFieldBelow(String letters) {
        List<WebElement> allCountriesAsWebElement = Driver.getDriver().findElements(By.xpath("//div/input[@value]"));


        //List<String> countryNames = new ArrayList<>();

        for (WebElement eachCountryName : allCountriesAsWebElement) {
            String countryName = eachCountryName.getAttribute("value");
            Assert.assertTrue(countryName.toLowerCase().startsWith(letters.toLowerCase()));
            //Assert.assertTrue(countryName.startsWith(letters));
           // countryNames.add(countryName);
            //System.out.println("countryName = " + countryName);
        }

    }
}
