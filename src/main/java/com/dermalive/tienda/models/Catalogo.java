package com.dermalive.tienda.models;

import javax.persistence.*;

@Entity
@Table(name = "catalogo")
public class Catalogo {
    
    @Id
    @Column(name="id_producto",updatable = false, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;
    
    @Column(name="nombre_producto",nullable=false)
    private String nombre_producto;

    @Column(name="precio",nullable=false)
    private String precio;
    
    @Column(name="sucursal",nullable=false)
    private String sucursal;
    
    @Column(name="imagen_url",nullable=false)
    private String imagen_url;
    
    
    public Catalogo(){}
    
    public Catalogo(
    String nombre_producto,
    String precio,
    String sucursal,
    String imagen_url
    ){
    this.nombre_producto = nombre_producto;
    this.precio = precio;
    this.sucursal = sucursal;
    this.imagen_url = imagen_url;
    }

    public Long getId_producto() {
        return id_producto;
    }

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

}