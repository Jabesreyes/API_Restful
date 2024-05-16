package udb.facultad.api.alumno;

import udb.facultad.api.DatosCurso;

public record DatosRegistroAlumno(String nombreAlumno, String fechaNacimiento, String numeroTelefono, String email, DatosCurso curso) {
}
