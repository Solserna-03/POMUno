package com.guru99.demo.stepdefinitions;

import com.guru99.demo.steps.RegistrarUsuarioStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistrarUsuarioStepDefinitions {

    @Steps
    RegistrarUsuarioStep registrarUsuario;

    @Given("^que el usuario se encuentre en la pagina$")
    public void queElUsuarioSeEncuentreEnLaPagina() {

        registrarUsuario.abrirNavegador();

    }

    @When("^el usuario ingresa los datos$")
    public void elUsuarioIngresaLosDatos() {
        registrarUsuario.ingresarUsuario();
        registrarUsuario.ingresarContrasena();
        registrarUsuario.clickBotonSubmit();

    }

    @Then("^el usuario valida que se muestre registro exitoso$")
    public void elUsuarioValidaQueSeMuestreRegistroExitoso() {
        registrarUsuario.validarMsj();



    }
}
