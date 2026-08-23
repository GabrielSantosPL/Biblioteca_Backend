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

import com.biblioteca.backend.model.autor;
import com.biblioteca.backend.service.autorService;


@RestController
@RequestMapping("/autor")
@CrossOrigin(origins = "*")
public class autorController {
    
    @Autowired
    private autorService autSer;

    @GetMapping
    public List<autor> list(){

        return autSer.listAll();

    }

    @GetMapping("/{id}")
    public autor find(@PathVariable Long id){

        return autSer.searchById(id);

    }

    @PostMapping
    public autor create(@RequestBody autor aut){

        return autSer.save(aut);

    }

    @PutMapping("/{id}")
    public autor update(@PathVariable Long id, @RequestBody autor aut){

        return autSer.update(id, aut);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        autSer.delete(id);

    }

}
