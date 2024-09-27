package com.Pankaj.Product_Services.service;

import java.util.List;
import java.util.Optional;

import com.Pankaj.Product_Services.dto.ProductDto;
import com.Pankaj.Product_Services.models.Product;

public interface ProductService {
   String ProductCreate(ProductDto productDto);
   List<Product> GetallProduct(); 
   Optional<Product> GetProductById(String id);
    
} 
