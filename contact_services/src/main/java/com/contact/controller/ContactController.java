package com.contact.controller;

import com.contact.services.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.contact.dto.ContactDto;
import com.contact.models.Conatct;

@RestController
@RequestMapping("api/web/v1/contact/")
public class ContactController {

    @Autowired
    private ConService servicec;

    @PostMapping("create")
    public ResponseEntity<?> create(@RequestBody ContactDto contactDto){
        String msg= servicec.createContact(contactDto);
        Map<String,String> res= new HashMap<>();

        res.put("message", msg);
        return ResponseEntity.status(201).body(res);

    }
    @GetMapping("get")
    public ResponseEntity<?> get(@RequestParam Long id){
        List<Conatct> conatct= servicec.getcontact(id);
        return ResponseEntity.status(201).body(conatct);
    }

    
}
