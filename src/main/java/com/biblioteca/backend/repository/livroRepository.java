package com.biblioteca.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.backend.model.livro;


public interface livroRepository extends JpaRepository<livro, Integer> {
    
}
