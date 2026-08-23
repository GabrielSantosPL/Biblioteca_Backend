package com.biblioteca.backend.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private categoria categoria;
    private String titulo;
    @Column(name = "isbn", nullable= false, unique = true, length = 20)
    private String isbn;
    private int ano_publicacao;

    @ManyToMany
    @JoinTable(
        name = "livro_autor",
        joinColumns = @JoinColumn(name = "id_livro"),
        inverseJoinColumns = @JoinColumn(name = "id_autor")
    )
    private List<autor> autores = new ArrayList<>();
}
