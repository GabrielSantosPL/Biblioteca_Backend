package com.biblioteca.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.backend.model.livro;
import com.biblioteca.backend.repository.livroRepository;

@Service
public class livroService {

    @Autowired
    private livroRepository livRep;

    public List<livro> listAll(){

        return livRep.findAll();

    }

    public livro save(livro liv){

        return livRep.save(liv);

    }

    public livro searchById(int id){

        return livRep.findById(id).orElse(null);

    }

    public livro update(int id, livro newLiv){

        livro oldLiv = searchById(id);

        oldLiv.setTitulo(newLiv.getTitulo());
        oldLiv.setCategoria(newLiv.getCategoria());
        oldLiv.setIsbn(newLiv.getIsbn());
        oldLiv.setAno_publicacao(newLiv.getAno_publicacao());
        oldLiv.setAutor(newLiv.getAutor());

        return livRep.save(oldLiv);

    }

    public void delete(int id){

        livRep.deleteById(id);

    }

}
