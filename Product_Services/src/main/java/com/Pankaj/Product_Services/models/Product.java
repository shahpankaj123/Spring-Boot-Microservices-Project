package com.Pankaj.Product_Services.models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "product")
@Data
public class Product {
    
    @Id
    private String id;
    private String name;
    private String desc;
    private BigDecimal price;
    
}
