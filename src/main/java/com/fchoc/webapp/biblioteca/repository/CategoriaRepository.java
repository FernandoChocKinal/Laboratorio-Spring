package com.fchoc.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fchoc.webapp.biblioteca.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
