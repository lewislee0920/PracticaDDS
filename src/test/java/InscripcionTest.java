import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    Materia analisis1 = new Materia("Analisis 1", new ArrayList<>());
    Materia analisis2 = new Materia("Analisis 2", new ArrayList<>(List.of(analisis1)));
    Alumno jaemin = new Alumno("Jaemin","1716839", new ArrayList<>(List.of(analisis1)));
    Inscripcion inscripcion = new Inscripcion(new ArrayList<>(List.of(jaemin)));

    @Test
    public void testAprobado() {
        jaemin.inscribirNuevoMateria(analisis2);
        assertTrue(inscripcion.aprobada(jaemin));
    }

    @Test
    public void testInscribir() {
        jaemin.inscribirNuevoMateria(analisis2);
        inscripcion.inscribir(jaemin);
        assertTrue(jaemin.materiasInscriptos.contains(analisis2));
    }

}