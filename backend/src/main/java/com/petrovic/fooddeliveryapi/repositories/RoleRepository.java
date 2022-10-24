package com.petrovic.fooddeliveryapi.repositories;

import com.petrovic.fooddeliveryapi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    Role findByName (String name);
}
