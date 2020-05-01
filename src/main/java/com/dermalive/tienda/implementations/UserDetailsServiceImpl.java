package com.dermalive.tienda.implementations;

import java.util.HashSet;
import java.util.Set;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private AdministradoresService AdministradoresService;
 
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Administradores administrador = AdministradoresService.findByUsername(username);
 
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority("administrador"));
 
        return new org.springframework.security.core.userdetails.User(
            administrador.getUsername(),
            administrador.getPassword(),
            grantedAuthorities
        );
    }
 
}