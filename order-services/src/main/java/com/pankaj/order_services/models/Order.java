package com.pankaj.order_services.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "order")
public class Order {
    @Id
    private String id;
    private String OrderNumber;
    private String skucode;
    private BigDecimal price;
    private String quantity;
    
}
