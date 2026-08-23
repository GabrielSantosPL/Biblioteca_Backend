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

import com.biblioteca.backend.model.emprestimo;
import com.biblioteca.backend.service.emprestimoService;

@RestController
@RequestMapping("/emprestimo")
@CrossOrigin(origins = "*")
public class emprestimoController {
    
    @Autowired
    private emprestimoService empSer;


    @GetMapping
    public List<emprestimo> list(){

        return empSer.listAll();

    }

    @GetMapping("/{id}")
    public emprestimo find(@PathVariable Long id){

        return empSer.searchById(id);

    }

    @PostMapping
    public emprestimo create(@RequestBody emprestimo emp){

        return empSer.save(emp);

    }

    @PutMapping("/{id}")
    public emprestimo update(@PathVariable Long id, @RequestBody emprestimo emp){

        return empSer.update(id, emp);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        empSer.delete(id);

    }

}
