package com.biblioteca.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.backend.model.emprestimo;
import com.biblioteca.backend.repository.emprestimoRepository;

public class emprestimoService {
    
    @Autowired
    private emprestimoRepository empRep;

    public List<emprestimo> listAll(){

        return empRep.findAll();

    }

    public emprestimo save(emprestimo emp){

        return empRep.save(emp);

    }

    public emprestimo searchById(Long id){

            return empRep.findById(id).orElse(null);

    }

    public emprestimo update(Long id, emprestimo newEmp){

        emprestimo oldEmp = searchById(id);

        oldEmp.setUsuario(newEmp.getUsuario());
        oldEmp.setExemplar(newEmp.getExemplar());
        oldEmp.setData_emprestimo(newEmp.getData_emprestimo());
        oldEmp.setData_prevista(newEmp.getData_prevista());
        oldEmp.setData_devolucao(newEmp.getData_devolucao());
        oldEmp.setStatus(newEmp.getStatus());

        return empRep.save(oldEmp);

    }

    public void delete(Long id){

        empRep.deleteById(id);

    }

}
