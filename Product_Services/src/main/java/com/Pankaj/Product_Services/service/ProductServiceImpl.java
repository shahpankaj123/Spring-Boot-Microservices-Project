package com.Pankaj.Product_Services.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Pankaj.Product_Services.dto.ProductDto;
import com.Pankaj.Product_Services.models.Product;
import com.Pankaj.Product_Services.repo.ProductRepo;

import lombok.Data;

@Service
@Data
public class ProductServiceImpl implements ProductService{

    private final ProductRepo productRepo;

    @Override
    public String ProductCreate(ProductDto productDto) {

        Product product=new Product();
        product.setName(productDto.getName());
        product.setDesc(productDto.getDesc());
        product.setPrice(productDto.getPrice());

        productRepo.save(product);

        return "Product Created Successfully";

    }
    public List<Product> GetallProduct(){
        return productRepo.findAll();
    }
    
    public Optional<Product> GetProductById(String id){
        return productRepo.findById(id);
    }
    
}
