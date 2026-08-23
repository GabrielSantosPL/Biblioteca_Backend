package com.biblioteca.backend.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class emprestimo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "id_exemplar")
    private exemplar exemplar;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String data_emprestimo;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String data_prevista;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String data_devolucao;
    private String status;

}
