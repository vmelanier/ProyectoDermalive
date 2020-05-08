package com.dermalive.tienda.services;

import com.dermalive.tienda.models.User;

public interface UserService {

    public User find(Long id);
    public Boolean save(User user);
    public User findByUsername(String username);


}