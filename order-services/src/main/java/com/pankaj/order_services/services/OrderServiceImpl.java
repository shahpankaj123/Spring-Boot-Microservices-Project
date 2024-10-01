package com.pankaj.order_services.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pankaj.order_services.dto.OrderDto;
import com.pankaj.order_services.models.OrderProducts;
import com.pankaj.order_services.repo.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService{
    
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public String OrderCreate(OrderDto orderDto) {
        OrderProducts order = new OrderProducts();
        order.setOrdernumber(orderDto.getOrdernumber());
        order.setPrice(orderDto.getPrice());
        order.setQuantity(orderDto.getQuantity());
        order.setSkucode(orderDto.getSkucode());
        orderRepo.save(order);
        String msg="Order Created Successfully";
        return msg;
    }
    
}
