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

import com.biblioteca.backend.model.categoria;
import com.biblioteca.backend.service.categoriaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/categoria")
public class categoriaController{

    @Autowired
    private categoriaService catSer;

    @GetMapping
    public List<categoria> list(){

        return catSer.listAll();

    }

    @GetMapping("/{id}")
    public categoria find(@PathVariable int id){

        return catSer.searchById(id);

    }

    @PostMapping
    public categoria create(@RequestBody categoria cat){

        return catSer.save(cat);

    }

    @PutMapping("/{id}")
    public categoria update(@PathVariable int id, @RequestBody categoria cat){

        return catSer.update(id, cat);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){

        catSer.delete(id);

    }

}