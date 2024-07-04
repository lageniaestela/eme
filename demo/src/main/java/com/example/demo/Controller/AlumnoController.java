package com.arquitecturajava.app1;

import com.example.demo.Service.GestorCursosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.Repository.AlumnoRepository;

@Controller
public class AlumnoController {

    @Autowired
    public GestorCursosService servicio;
    @RequestMapping("/listaalumnos")
    public String listaAlumnos(Model modelo) {

        modelo.addAttribute("listaalumnos",servicio.buscarTodosalumnos());
        return "listaalumnos";
    }

}
