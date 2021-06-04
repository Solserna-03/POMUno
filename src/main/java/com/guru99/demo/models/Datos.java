package com.guru99.demo.models;

public class Datos {

    String usuario;
    String contrasena;

    public Datos (String usuario, String contrasena){
        super();
        this.usuario=usuario;
        this.contrasena=contrasena;

    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}
