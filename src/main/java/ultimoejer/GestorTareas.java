package ultimoejer;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea> tareas;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public List<Tarea> getTareasPendientes() {
        List<Tarea> pendientes = new ArrayList<>();
        for (Tarea t : tareas) {
            if (!t.isCompletada()) pendientes.add(t);
        }
        return pendientes;
    }

    public List<Tarea> getTareasCompletadas() {
        List<Tarea> completadas = new ArrayList<>();
        for (Tarea t : tareas) {
            if (t.isCompletada()) completadas.add(t);
        }
        return completadas;
    }
}
