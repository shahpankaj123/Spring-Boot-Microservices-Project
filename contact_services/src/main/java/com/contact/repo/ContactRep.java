package com.contact.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.contact.models.Conatct;

public interface ContactRep extends JpaRepository<Conatct,Long>{

    List<Conatct> findAllByUserId(@Param("userId") Long userId);

    
}
