package com.pankaj.order_services.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pankaj.order_services.models.Order;

public interface OrderRepo extends JpaRepository<Order,String>{
    
}
