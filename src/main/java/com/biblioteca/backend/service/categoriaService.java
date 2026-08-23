package com.biblioteca.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.backend.model.categoria;
import com.biblioteca.backend.repository.categoriaRepository;

@Service
public class categoriaService {

    @Autowired
    private categoriaRepository catRep;

    public List<categoria> listAll() {

        return catRep.findAll();

    }

    public categoria save(categoria cat){

        return catRep.save(cat);

    }

    public categoria searchById(int id){

        return catRep.findById(id).orElse(null);

    }

    public categoria update(int id, categoria newCat){

        categoria oldCat = searchById(id);

        oldCat.setNome(newCat.getNome());

        return catRep.save(oldCat);

    }

    public void delete(int id){

        catRep.deleteById(id);

    }

}