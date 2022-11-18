package com.blaze.www.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/loginSerenity.feature",
        glue = "com.blaze.www.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class LoginSerenityRunner {

}
