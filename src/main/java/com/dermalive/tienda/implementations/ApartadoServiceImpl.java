package com.dermalive.tienda.implementations;

import java.util.List;

import com.dermalive.tienda.models.Apartado;
import com.dermalive.tienda.repositories.ApartadoRepository;
import com.dermalive.tienda.services.ApartadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartadoServiceImpl implements ApartadoService {

    @Autowired
    private ApartadoRepository repository;
 
    public List<Apartado> all() {
        return repository.findAll();
    }

    public Apartado find(Long id) {
        return repository.getOne(id);
    }

    public Boolean save(Apartado apartado) {
        try {
            repository.save(apartado);
            return true;
        } catch (Exception e) {
           // Log de la excepcion
            return false;
        }
    }

}