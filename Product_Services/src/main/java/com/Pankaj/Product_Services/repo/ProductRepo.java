package com.Pankaj.Product_Services.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Pankaj.Product_Services.models.Product;

public interface ProductRepo extends MongoRepository<Product,String>{

    
} 