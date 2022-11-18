package com.blaze.www.stepdefinitions;

import Steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {
    @Steps
    LoginSteps pasos;

    @Given("que el usuario se encuentre en la pagina principal")
    public void queElUsuarioSeEncuentreEnLaPaginaPrincipal() {
        pasos.abrirNavegador();
    }

    @When("ingrese usuario y clave")
    public void fillForm() throws InterruptedException {
        pasos.enterFirstName();
        pasos.enterLastName();
        pasos.enterEmail();
        pasos.selMale();
        pasos.enterPhone();
        pasos.clickBDate();
        pasos.enterBDate();
        pasos.enterYear();
        pasos.enterDay();
        pasos.chkHobbieSport();
        pasos.chooseFile();
        pasos.enterCurrentAdd();
        pasos.selState();
        pasos.selCity();
        pasos.submit();
    }

    @Then("el usuario visualiza su nombre en la pagina")
    public void elUsuarioVisualizaSuNombreEnLaPagina() {
        pasos.validarUsuario();
    }

}
