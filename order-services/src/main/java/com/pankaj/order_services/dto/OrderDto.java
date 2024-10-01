package com.pankaj.order_services.dto;

import java.math.BigDecimal;

import lombok.Data;


@Data
public class OrderDto {
    private String ordernumber;
    private String skucode;
    private BigDecimal price;
    private String quantity;   
}
