package com.biblioteca.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.backend.model.reserva;

public interface reservaRepository extends JpaRepository<reserva, Long> {
    
}
