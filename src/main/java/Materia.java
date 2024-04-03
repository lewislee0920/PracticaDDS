import java.util.List;

public class Materia {
    public String nombre;
    public List<Materia> materiasCorrelativas;

    public Materia(String nombre, List<Materia> materiasCorrelativass) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativass;
    }
}
