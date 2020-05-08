package com.dermalive.tienda.implementations;

import com.dermalive.tienda.models.User;
import com.dermalive.tienda.repositories.UserRepository;
import com.dermalive.tienda.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    public User find(Long id) {
        return repository.getOne(id);
    }

    public Boolean save(User user) {
        try {
            repository.save(user);
            return true;
        } catch (Exception e) {
           // Log de la excepcion
            return false;
        }
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

}