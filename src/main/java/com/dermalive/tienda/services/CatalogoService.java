package com.dermalive.tienda.services;

import java.util.List;

import com.dermalive.tienda.models.Catalogo;

public interface CatalogoService {
    public List<Catalogo> all();
    public Catalogo find (Long idProducto);
    public Boolean save(Catalogo catalogo);
    public Boolean delete(Catalogo catalogo);
}