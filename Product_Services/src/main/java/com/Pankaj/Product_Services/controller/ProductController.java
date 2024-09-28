package com.Pankaj.Product_Services.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Pankaj.Product_Services.dto.ProductDto;
import com.Pankaj.Product_Services.service.ProductService;

import java.util.Map;

@RestController
@RequestMapping("api/v1/product/")
public class ProductController {
    
    @Autowired
    private  ProductService productService;

    @PostMapping("create")
    public ResponseEntity<?> create(@RequestBody ProductDto productDto){

        String message=productService.ProductCreate(productDto);

        Map<String, String> response = new HashMap<>();
        response.put("message", message);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("get-all")
    public ResponseEntity<?> get(){
        return ResponseEntity.status(200).body(productService.GetallProduct());
    }

    @GetMapping("get")
    public ResponseEntity<?> getbyid(@RequestParam String id){
        return ResponseEntity.status(200).body(productService.GetProductById(id));
    }

    
}
