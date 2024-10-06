package com.orlando.backend.usersapp.backendusersapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.orlando.backend.usersapp.backendusersapp.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
