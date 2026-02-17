package ultimoejer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestorTareasTest {

    @Test
    public void testAgregarTarea() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea(new Tarea("Tarea 1", "Descripcion", 1));
        assertEquals(1, gestor.getTareasPendientes().size());
    }

    @Test
    public void testMarcarCompletada() {
        GestorTareas gestor = new GestorTareas();
        Tarea t = new Tarea("Tarea 1", "Descripcion", 1);
        gestor.agregarTarea(t);
        t.marcarCompletada();
        assertEquals(1, gestor.getTareasCompletadas().size());
        assertEquals(0, gestor.getTareasPendientes().size());
    }
}
