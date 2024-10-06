package com.orlando.backend.usersapp.backendusersapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.orlando.backend.usersapp.backendusersapp.services.ProductService;
import com.orlando.backend.usersapp.backendusersapp.models.entities.Product;

@RestController
//@CrossOrigin(origins = "http://localhost:5173")

public class ProductController {
    
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list() {
        return service.findAll();
    }
}
