package com.guru99.demo.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.guru99.com/test/newtours/index.php")

public class LoginUsuarioPageObject extends PageObject {
    By txtUsuario = By.name("userName");
    By txtClave = By.name("password");
    By btnSubmit = By.name("submit");
    By msjValidacion = By.xpath("//h3 [contains(., '" +
            "Login Successfully')]");

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(By txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public void setTxtClave(By txtClave) {
        this.txtClave = txtClave;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(By btnSubmit) {
        this.btnSubmit = btnSubmit;
    }

    public By getMsjValidacion() {
        return msjValidacion;
    }

    public void setMsjValidacion(By msjValidacion) {
        this.msjValidacion = msjValidacion;
    }


}
