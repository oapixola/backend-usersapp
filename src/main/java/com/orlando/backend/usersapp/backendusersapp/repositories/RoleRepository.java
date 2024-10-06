package com.orlando.backend.usersapp.backendusersapp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.orlando.backend.usersapp.backendusersapp.models.entities.Role;

public interface RoleRepository
        extends CrudRepository<Role, Long> {
        Optional<Role> findByName(String name);
}
