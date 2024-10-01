package com.pankaj.order_services.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pankaj.order_services.dto.OrderDto;
import com.pankaj.order_services.services.OrderService;

@Controller
@RequestMapping("api/v1/order/")
public class OrderController {

    @Autowired
    private OrderService orderService;
    
    @PostMapping("create")
    public ResponseEntity<?> create(@RequestBody OrderDto orderDto){

        String msg =orderService.OrderCreate(orderDto);
        
        Map<String ,String> mp =new HashMap<>();
        mp.put("message",msg);
        return ResponseEntity.status(201).body(mp);

    }
    
}
