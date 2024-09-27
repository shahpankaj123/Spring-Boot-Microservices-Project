package com.Pankaj.Product_Services.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductDto {
    private String name;
    private String desc;
    private BigDecimal price;
    
}
