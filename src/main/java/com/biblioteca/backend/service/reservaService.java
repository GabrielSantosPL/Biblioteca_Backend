package com.biblioteca.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.backend.model.reserva;
import com.biblioteca.backend.repository.reservaRepository;

@Service
public class reservaService {
    
    @Autowired
    private reservaRepository resRep;

    public List<reserva> listAll(){

        return resRep.findAll();

    }

    public reserva save(reserva res){

        return resRep.save(res);

    }

    public reserva searchById(Long id){

        return resRep.findById(id).orElse(null);

    }

    public reserva update(Long id, reserva newRes){

        reserva oldRes = searchById(id);

        oldRes.setUsuario(newRes.getUsuario());
        oldRes.setLivro(newRes.getLivro());
        oldRes.setData_reserva(newRes.getData_reserva());
        oldRes.setStatus(newRes.getStatus());

        return resRep.save(oldRes);

    }

    public void delete(Long id){

        resRep.deleteById(id);

    }

}
