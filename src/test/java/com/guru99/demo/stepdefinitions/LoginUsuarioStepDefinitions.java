package com.guru99.demo.stepdefinitions;

import com.guru99.demo.models.Datos;
import com.guru99.demo.steps.LoginUsuarioStep;
import com.guru99.demo.steps.RegistrarUsuarioStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginUsuarioStepDefinitions {
    @Steps
    LoginUsuarioStep loginUsuario;


    @Given("^que el usuario este en la pagina$")
    public void queElUsuarioEsteEnLaPagina() {
        loginUsuario.abrirNavegador();

    }


    @When("^el usuario ingresa usuario y contrasena$")
    public void elUsuarioIngresaUsuarioYContrasena(List<Datos> datos) {
        loginUsuario.ingresarUsuario(datos.get(0).getUsuario());
        loginUsuario.ingresarContrasena(datos.get(0).getContrasena());
        loginUsuario.clickBotonSubmit();

    }

    @Then("^el usuario valida que se muestre login exitoso$")
    public void elUsuarioValidaQueSeMuestreLoginExitoso() {
        loginUsuario.validarMsj();

    }
}
