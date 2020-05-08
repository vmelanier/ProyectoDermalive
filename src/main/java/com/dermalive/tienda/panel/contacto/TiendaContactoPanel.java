package com.dermalive.tienda.panel.contacto;

public class TiendaContactoPanel {

    private String title;

    private String telefono;

    private String email;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(" TiendaContactoPanel [ title=%s, telefono=%s, email=%s]",
        title , telefono, email
        );
    }



}