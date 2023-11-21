package com.ejemplo.demo.ejemplo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ejemplo {
    //Atributos de la clase
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String email;
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String password;

}