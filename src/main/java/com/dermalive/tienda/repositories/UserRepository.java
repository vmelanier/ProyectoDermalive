package com.dermalive.tienda.repositories;

import com.dermalive.tienda.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}