package com.orlando.backend.usersapp.backendusersapp.services;

import java.util.List;
import com.orlando.backend.usersapp.backendusersapp.models.entities.Product;

public interface ProductService {
    List<Product> findAll();
}
