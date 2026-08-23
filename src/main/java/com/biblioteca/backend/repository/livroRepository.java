package com.biblioteca.backend.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.backend.model.livro;


public interface livroRepository extends JpaRepository<livro, Integer> {
    
    List<livro> findByCategoriaId(Integer categoriaId);
    List<livro> findByAutorId(Long autorId);

}
