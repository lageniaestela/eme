package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Repository.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Table(name="Alumno")
public class Alumno {
    private String nombre;
    private int edad;





}
