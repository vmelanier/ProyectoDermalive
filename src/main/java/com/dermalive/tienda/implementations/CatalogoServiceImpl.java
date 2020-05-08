package com.dermalive.tienda.implementations;

import java.util.List;

import com.dermalive.tienda.models.Catalogo;
import com.dermalive.tienda.repositories.CatalogoRepository;
import com.dermalive.tienda.services.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogoServiceImpl implements CatalogoService {
    
    @Autowired
    private CatalogoRepository repository;

    public List<Catalogo> all() {
        return repository.findAll();
    };

    public Catalogo find(Long idCatalogo) {
       return repository.getOne(idCatalogo);
    }

    public Boolean save(Catalogo catalogo) {
        try {
            repository.save(catalogo);
            return true;
        } catch (Exception e) {
        // Log de la excepcion
        return false;
        }
    }

    public Boolean delete(Catalogo catalogo) {
        try {
            repository.delete(catalogo);
            return true;
        } catch (Exception e) {
        // Log de la excepcion
        return false;
        }
    }
    
}