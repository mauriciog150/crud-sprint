package com.ejemplo.demo.ejemplo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ejemploService {
    //Consumir el Repository
    @Autowired
    ejemploRepository repository;

    public ejemplo save( ejemplo entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public ejemplo findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<ejemplo> findAll(){
        return repository.findAll();
    }

}