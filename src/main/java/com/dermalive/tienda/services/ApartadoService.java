package com.dermalive.tienda.services;

import com.dermalive.tienda.models.Apartado;
import java.util.List;


public interface ApartadoService {

    public List<Apartado> all();

    public Apartado find (Long id);
    public Boolean save(Apartado email);

}