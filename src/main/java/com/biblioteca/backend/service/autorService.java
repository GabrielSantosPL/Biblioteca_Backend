package com.biblioteca.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.backend.model.autor;
import com.biblioteca.backend.repository.autorRepository;

public class autorService {

    @Autowired
    private autorRepository autRep;

    public List<autor> listAll(){

        return autRep.findAll();

    }

    public autor searchById(Long id){

        return autRep.findById(id).orElse(null);

    }

    public autor save(autor aut){

        return autRep.save(aut);

    }

    public autor update(Long id, autor newAut){

        autor oldAut = searchById(id);

        oldAut.setNome(newAut.getNome());

        return autRep.save(oldAut);

    }

    public void delete(Long id){

        autRep.deleteById(id);

    }

}
