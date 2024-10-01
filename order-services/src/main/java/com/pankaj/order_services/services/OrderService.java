package com.pankaj.order_services.services;

import com.pankaj.order_services.dto.OrderDto;

public interface OrderService {

    String OrderCreate(OrderDto orderDto);
    
}
