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

import com.biblioteca.backend.model.reserva;
import com.biblioteca.backend.service.reservaService;

@RestController
@RequestMapping("/reserva")
@CrossOrigin(origins = "*")
public class reservaController {
    
    @Autowired
    private reservaService resSer;

    @GetMapping
    public List<reserva> list(){

        return resSer.listAll();

    }

    @GetMapping("/{id}")
    public reserva find(@PathVariable Long id){

        return resSer.searchById(id);
        
    }

    @PostMapping
    public reserva create(@RequestBody reserva res){

        return resSer.save(res);

    }

    @PutMapping("/{id}")
    public reserva update(@PathVariable Long id, @RequestBody reserva res){

        return resSer.update(id, res);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        resSer.delete(id);

    }

}
