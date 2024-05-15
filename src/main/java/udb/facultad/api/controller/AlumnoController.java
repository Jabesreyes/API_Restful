package udb.facultad.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @PostMapping
    public void registrarAlumno(@RequestBody String parametro){
        System.out.println("Llego el request");
        System.out.println(parametro);
    }
}
