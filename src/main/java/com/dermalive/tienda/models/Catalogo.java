package com.dermalive.tienda.models;

import javax.persistence.*;

@Entity
@Table(name = "catalogo")
public class Catalogo {
    
    @Id
    @Column(name="idProducto",updatable = false, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    
    @Column(name="nombreProducto",nullable=false)
    private String nombreProducto;

    @Column(name="precio",nullable=false)
    private String precio;
    
    @Column(name="sucursal",nullable=false)
    private String sucursal;
    
    @Column(name="imagenUrl",nullable=false)
    private String imagenUrl;
    
    
    public Catalogo(){}
    
    public Catalogo(
    String nombreProducto,
    String precio,
    String sucursal,
    String imagenUrl
    ){
    this.nombreProducto = nombreProducto;
    this.precio = precio;
    this.sucursal = sucursal;
    this.imagenUrl = imagenUrl;
    }


public Long getIdProducto() {
    return idProducto;
}
    

public String getNombreProducto() {
	return precio;
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




}








