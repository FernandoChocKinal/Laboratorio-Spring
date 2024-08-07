package com.fchoc.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fchoc.webapp.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository <Libro, Long> {

}
