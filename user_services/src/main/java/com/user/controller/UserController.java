package com.user.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.dto.userdto;
import com.user.models.user;
import com.user.services.UserService;

@Controller
@RequestMapping("api/web/v1/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("user/create")
    public ResponseEntity<?> create(@RequestBody userdto usrdto){
        String msg =userService.CreateUser(usrdto);
        Map<String,String> res= new HashMap<>();
        res.put("message", msg);
        return ResponseEntity.status(201).body(res);
    }
    @GetMapping("user")
    public ResponseEntity<?> getbyid(@RequestParam Long id){
        Optional<user> usr=userService.getUser(id);
        return ResponseEntity.status(200).body(usr);
    }    
}
