package com.example.demo.Repository;
import java.util.List;
import java.util.ArrayList;
import java.lang.*;

import com.example.demo.Model.Alumno;
import org.springframework.stereotype.Repository;

@Repository
public class AlumnoRepository {
    private static List<Alumno> alumnos=new ArrayList<Alumno>();
    static {

       // alumnos.add(new Alumno);
      alumnos.add(new Alumno("ana",50));
    }
    public List<Alumno> buscarTodos(){
        return alumnos;
    }
    public void insertardesdeelrepository(Alumno aaa){
        alumnos.add(aaa);
    }
}
