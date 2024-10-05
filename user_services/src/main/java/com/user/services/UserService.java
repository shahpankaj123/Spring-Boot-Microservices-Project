package com.user.services;

import java.util.Optional;

import com.user.dto.userdto;
import com.user.models.user;

public interface UserService {

    String CreateUser(userdto usrdto);
    Optional<user> getUser(Long id);
 
    
}
