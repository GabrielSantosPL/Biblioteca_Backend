package com.biblioteca.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.backend.model.emprestimo;

public interface emprestimoRepository extends JpaRepository<emprestimo, Long> {

    
}