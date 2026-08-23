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

import com.biblioteca.backend.model.livro;
import com.biblioteca.backend.service.livroService;


@RestController
@RequestMapping("/livro")
@CrossOrigin(origins = "*")
public class livroController {
    
    @Autowired
    private livroService livSer;

    @GetMapping
    public List<livro> list(){

        return livSer.listAll();

    }

    @GetMapping("/{id}")
    public livro find(@PathVariable int id){

        return livSer.searchById(id);

    }

    @PostMapping
    public livro create(@RequestBody livro liv){

        return livSer.save(liv);

    }

    @PutMapping("/{id}")
    public livro update(@PathVariable int id, @RequestBody livro liv){

        return livSer.update(id, liv);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){

        livSer.delete(id);

    }

}
