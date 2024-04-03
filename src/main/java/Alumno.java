import java.util.ArrayList;
import java.util.List;

public class Alumno {
    public String nombre;
    public String legajo;
    public List<Materia> materiasAprobados;
    public List<Materia> materiasInscriptos = new ArrayList<>();
    public Materia materiaAInscribir;

    public void inscribirNuevoMateria(Materia materia) {
        materiaAInscribir = materia;
    }

    public Alumno(String nombre, String legajo, List<Materia> materiasAprobados) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobados = materiasAprobados;
    }
}
