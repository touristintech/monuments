package com.nitzbits.service;

import com.nitzbits.model.CustomAdminModel;
import com.nitzbits.model.Users;
import com.nitzbits.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomAdminService implements UserDetailsService {

    @Autowired
    private UsersRepository usersRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = this.usersRepository.findUsersByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("No user with this name is available.");
        }

        return new CustomAdminModel(user);
    }
}
