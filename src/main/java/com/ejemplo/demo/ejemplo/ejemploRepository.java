package com.ejemplo.demo.ejemplo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ejemploRepository  extends CrudRepository<ejemplo,Long>{
    List<ejemplo> findAll();
    
}