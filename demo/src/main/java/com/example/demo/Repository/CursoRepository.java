package com.example.demo.Repository;

import com.example.demo.Model.Alumno;
import com.example.demo.Model.Curso;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.util.Scanner;


@Repository
public class CursoRepository {
    private static List<Curso> curso=new ArrayList<Curso>();
    static {


        curso.add(new Curso("php",20));

    }


}
