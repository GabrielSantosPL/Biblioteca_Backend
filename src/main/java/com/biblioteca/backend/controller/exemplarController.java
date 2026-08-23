package com.biblioteca.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.backend.model.exemplar;
import com.biblioteca.backend.service.exemplarService;


@RestController
@RequestMapping("/exemplar")
@CrossOrigin(origins = "*")
public class exemplarController {
    
    @Autowired
    private exemplarService exeSer;

    @GetMapping
    public List<exemplar> list(){

        return exeSer.listAll();

    }

    @GetMapping("/{id}")
    public exemplar find(@PathVariable Long id){

        return exeSer.searchById(id);

    }

    @PostMapping
    public exemplar create(@RequestBody exemplar exe){

        return exeSer.save(exe);

    }

    @PutMapping("/{id}")
    public exemplar update(@PathVariable Long id, @RequestBody exemplar exe){

        return exeSer.update(id, exe);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        exeSer.delete(id);

    }

}
