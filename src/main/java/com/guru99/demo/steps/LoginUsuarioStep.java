package com.guru99.demo.steps;

import com.guru99.demo.pageobject.LoginUsuarioPageObject;
import com.guru99.demo.pageobject.RegistrarUsuarioPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

import static org.junit.Assert.assertThat;


public class LoginUsuarioStep {

    LoginUsuarioPageObject loginPOM =new LoginUsuarioPageObject();
    @Step
    public void abrirNavegador(){
        loginPOM.open();


    }
    @Step
    public void ingresarUsuario (String usuario){
        loginPOM.getDriver().findElement(loginPOM.getTxtUsuario()).sendKeys(usuario);


    }

    @Step
    public void ingresarContrasena (String contrasena){
        loginPOM.getDriver().findElement(loginPOM.getTxtClave()).sendKeys(contrasena);


    }

    @Step
    public void clickBotonSubmit (){
        loginPOM.getDriver().findElement(loginPOM.getBtnSubmit()).click();


    }

    @Step
    public void validarMsj (){
        assertThat (loginPOM.getDriver().findElement(loginPOM.getMsjValidacion()).isDisplayed(), Matchers.is(true));


    }

}
