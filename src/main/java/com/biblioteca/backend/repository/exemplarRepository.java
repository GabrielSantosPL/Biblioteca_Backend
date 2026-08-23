package com.biblioteca.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.backend.model.exemplar;

public interface exemplarRepository extends JpaRepository<exemplar, Long> {
    
}
