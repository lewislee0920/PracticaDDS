import java.util.List;

public class Inscripcion {
    public List<Alumno> alumnos;

    public Inscripcion(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    public boolean aprobada(Alumno alumno){
        return alumno.materiasAprobados.containsAll(alumno.materiaAInscribir.materiasCorrelativas);
    }

    public void inscribir(Alumno alumno) {
        if(this.aprobada(alumno)) {
            alumno.materiasInscriptos.add(alumno.materiaAInscribir);
        }
    }

    public void inscribirAlumnos() {
        alumnos.forEach(alumno -> this.inscribir(alumno));
    }
}
