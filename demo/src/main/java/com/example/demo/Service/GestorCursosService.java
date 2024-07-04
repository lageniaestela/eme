package com.example.demo.Service;
import java.util.List;

import com.example.demo.Model.Alumno;
import com.example.demo.Repository.AlumnoRepository;
import com.example.demo.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.*;


@Service

public class GestorCursosService {
    @Autowired
    AlumnoRepository repoAlumno;
    //JPAREPOSITORY===AlumnosRepository recorrer todo el listado que puede tabla entidad
    CursoRepository repoCurso;
    public void insertar(Alumno xxx){
        repoAlumno.insertardesdeelrepository(xxx);
    }
    public List<Alumno>buscarTodosalumnos(){
        return repoAlumno.buscarTodos();
    }


}
