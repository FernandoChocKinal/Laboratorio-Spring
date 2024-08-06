package com.fchoc.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fchoc.webapp.biblioteca.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
