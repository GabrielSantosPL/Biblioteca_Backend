package com.biblioteca.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.backend.model.categoria;

public interface categoriaRepository extends JpaRepository<categoria, Integer>{}