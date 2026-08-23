package com.biblioteca.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.backend.model.usuario;
import com.biblioteca.backend.repository.usuarioRepository;

public class usuarioService {
    
    @Autowired
    public usuarioRepository usuRep;

    public List<usuario> listAll(){

        return usuRep.findAll();

    }

    public usuario save(usuario usu){

        return usuRep.save(usu);

    }

    public usuario searchById(Long id){

        return usuRep.findById(id).orElse(null);

    }

    public usuario update(Long id, usuario newUsu){

        usuario oldUsu = searchById(id);

        oldUsu.setNome(newUsu.getNome());
        oldUsu.setEmail(newUsu.getEmail());
        oldUsu.setTipo_usuario(newUsu.getTipo_usuario());
        oldUsu.setStatus(newUsu.getStatus());

        return usuRep.save(oldUsu);

    }

    public void delete(Long id){

        usuRep.deleteById(id);

    }

}
