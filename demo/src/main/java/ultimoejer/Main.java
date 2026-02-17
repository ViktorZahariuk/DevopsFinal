package ultimoejer;


public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();

        gestor.agregarTarea(new Tarea("Estudio de mercado", "Analizar DAFO y preferencias", 1));
        gestor.agregarTarea(new Tarea("Crear presentación", "Preparar slides para FOL", 2));

        System.out.println("Tareas pendientes:");
        for (Tarea t : gestor.getTareasPendientes()) {
            System.out.println(t);
        }

        // Marcar la primera como completada
        gestor.getTareasPendientes().get(0).marcarCompletada();

        System.out.println("\nTareas completadas:");
        for (Tarea t : gestor.getTareasCompletadas()) {
            System.out.println(t);
        }
    }
}