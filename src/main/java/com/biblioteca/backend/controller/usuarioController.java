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

import com.biblioteca.backend.model.usuario;
import com.biblioteca.backend.service.usuarioService;


@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class usuarioController {
    
    @Autowired
    private usuarioService usuSer;
    
    @GetMapping
    public List<usuario> list(){

        return usuSer.listAll();

    }

    @GetMapping("/{id}")
    public usuario find(@PathVariable Long id){

        return usuSer.searchById(id);

    }

    @PostMapping
    public usuario create(@RequestBody usuario usu){

        return usuSer.save(usu);

    }

    @PutMapping("/{id}")
    public usuario update(@PathVariable Long id, @RequestBody usuario usu){

        return usuSer.update(id, usu);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        usuSer.delete(id);

    }

}
