package com.dermalive.tienda.panel.Catalogo;
import javax.validation.constraints.NotEmpty;

public class UpdateCatalogoForm {

    @NotEmpty(message = "El nombre del producto no puede estar vacio")
    String nombre_producto;
    
    @NotEmpty(message = "El precio del producto no puede estar vacio")
    String precio;
    
    @NotEmpty(message = "La sucursal no puede estar vacia")
    String sucursal;
    
    @NotEmpty(message = "La Url no puede estar vacia")
    String imagen_url;
    
    public String getNombre_producto() {
        return nombre_producto;
    }
    
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
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
    
    public String getImagen_url() {
        return imagen_url;
    }
    
    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }
    
    @Override
    public String toString(){
        return String.format(
            "StoreCatalogoForm [nombre_producto=%s,precio=%s,sucursal=%s,imagen_url=%s",
            nombre_producto,
    precio,
    sucursal,
    imagen_url
        );
    }
    }