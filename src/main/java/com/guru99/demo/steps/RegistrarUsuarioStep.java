package com.guru99.demo.steps;

import com.guru99.demo.pageobject.RegistrarUsuarioPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

import java.net.URL;
import java.util.regex.Matcher;

import static org.junit.Assert.assertThat;

public class RegistrarUsuarioStep {
    RegistrarUsuarioPageObject registrarUsuarioPOM = new RegistrarUsuarioPageObject();

    @Step
    public void abrirNavegador (){
        registrarUsuarioPOM.open();
        registrarUsuarioPOM.getDriver().manage().window().maximize();


    }
    @Step
    public void ingresarUsuario (){
        registrarUsuarioPOM.getDriver().findElement(registrarUsuarioPOM.getTxtUsuario()).sendKeys("milena12@gmail.com");


    }

    @Step
    public void ingresarContrasena (){
        registrarUsuarioPOM.getDriver().findElement(registrarUsuarioPOM.getTxtClave()).sendKeys("mile.6920");

    }

    @Step
    public void clickBotonSubmit (){
        registrarUsuarioPOM.getDriver().findElement (registrarUsuarioPOM.getBtnSubmit()).click();

    }

    @Step
    public void validarMsj (){
        assertThat (registrarUsuarioPOM.getDriver().findElement(registrarUsuarioPOM.getMsjValidacion()).isDisplayed(), Matchers.is(true));

    }


}
