package com.user.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dto.userdto;
import com.user.models.user;
import com.user.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public String CreateUser(userdto usrdto) {
        user usr =new user();
        usr.setFull_name(usrdto.getFull_name());
        userRepo.save(usr);
        return "User Created Sucessfully";
    }

    @Override
    public Optional<user> getUser(Long id) {
       Optional<user> usr = userRepo.findById(id);
       if(usr.isPresent())
          return usr;
       else
         return null;   
    }
    
    
}
