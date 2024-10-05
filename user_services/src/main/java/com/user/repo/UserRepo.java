package com.user.repo;
import com.user.models.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<user, Long> {
    
}
