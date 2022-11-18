package com.blaze.www.stepdefinitions;

import Steps.LoginSerenitySteps;
import io.cucumber.java.en.*;
import models.Users;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.model.DataTable;

import java.util.List;

public class LoginSerenityStepDefinitions {

    @Steps
    LoginSerenitySteps steps;

    @Given("Im on the website login page")
    public void imOnTheWebsiteLoginPage() {
        steps.abrirNavegador();
    }
    @When("type the following information")
    public void typeTheFollowingInformation() {
        steps.enterUser();
        steps.enterPassword();
        steps.clickOnLogin();

    }
    @Then("im will be able to see my name on screen")
    public void imWillBeAbleToSeeMyNameOnScreen() {
        steps.validateText();
    }

}
