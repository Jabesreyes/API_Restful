package udb.facultad.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udb.facultad.api.alumno.DatosRegistroAlumno;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @PostMapping
    public void registrarAlumno(@RequestBody DatosRegistroAlumno datosRegistroAlumno){
        System.out.println("Llego el request");
        System.out.println(datosRegistroAlumno);
    }
}
