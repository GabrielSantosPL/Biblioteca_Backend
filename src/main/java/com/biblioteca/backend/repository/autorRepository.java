package com.biblioteca.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.backend.model.autor;

public interface autorRepository extends JpaRepository<autor, Long> {
    
}
