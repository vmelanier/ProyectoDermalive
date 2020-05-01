package com.dermalive.tienda.panel.Catalogo;

import javax.validation.constraints.NotEmpty;

public class StoreCatalogoForm {


@NotEmpty(message = "El nombre del producto no puede estar vacio")
String nombreProducto;

@NotEmpty(message = "El precio del producto no puede estar vacio")
String precio;

@NotEmpty(message = "La sucursal no puede estar vacia")
String sucursal;

@NotEmpty(message = "La Url no puede estar vacia")
String imagenUrl;

public String getNombreProducto() {
    return nombreProducto;
}

public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
}

public String getPrecio() {
    return precio;
}

public void setPrecio(String precio) {
    this.precio = precio;
}

public String getSucursal() {
    return sucursal;
}

public void setSucursal(String sucursal) {
    this.sucursal = sucursal;
}
public String getImagenUrl() {
    return imagenUrl;
}

public void setImagenUrl(String imagenUrl) {
    this.imagenUrl = imagenUrl;
}

@Override
public String toString(){
    return String.format(
        "StoreCatalogoForm [nombreProducto=%s,precio=%s,sucursal=%s,imagenUrl=%s",
        nombreProducto,
precio,
sucursal,
imagenUrl
    );
}

}