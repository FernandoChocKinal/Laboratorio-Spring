package com.fchoc.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fchoc.webapp.biblioteca.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    
}
