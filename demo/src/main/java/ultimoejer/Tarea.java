
package ultimoejer;
public class Tarea {
    private String nombre;
    private String descripcion;
    private int prioridad;
    private boolean completada;

    public Tarea(String nombre, String descripcion, int prioridad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getPrioridad() { return prioridad; }
    public boolean isCompletada() { return completada; }
    public void marcarCompletada() { this.completada = true; }

    @Override
    public String toString() {
        return "[" + (completada ? "✔" : "✖") + "] " + nombre + " (Prioridad: " + prioridad + ")";
    }
}