package com.infinitycodes.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infinitycodes.userdept.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{
    
}
