package com.ejemplo.demo.ejemplo;

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

@RestController
@RequestMapping("/app/ejemplo")
@CrossOrigin({"*"})

public class ejemploController 
{
   //Consumir el servicio
   @Autowired
   private ejemploService service;

    @GetMapping("/{id}/")
    public ejemplo findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<ejemplo> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public ejemplo save( @RequestBody ejemplo entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public ejemplo update ( @RequestBody ejemplo entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}