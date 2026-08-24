package com.biblioteca.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.backend.model.exemplar;
import com.biblioteca.backend.repository.exemplarRepository;

@Service
public class exemplarService {
    
    @Autowired
    private exemplarRepository exeRep;

    public List<exemplar> listAll(){

        return exeRep.findAll();

    }

    public exemplar save(exemplar exe){

        return exeRep.save(exe);

    }

    public exemplar searchById(Long id){

        return exeRep.findById(id).orElse(null);

    }

    public exemplar update(Long id, exemplar newExe){

        exemplar oldExe = searchById(id);

        oldExe.setStatus(newExe.getStatus());

        return exeRep.save(oldExe);

    }

    public void delete(Long id){

        exeRep.deleteById(id);

    }

}
