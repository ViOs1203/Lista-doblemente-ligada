// Piña Becerra Victor Osvaldo

package back_end;

public record Proceso(int id, String nombre, int prioridad) {
    public Proceso {
        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser un número entero mayor a 0.");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del proceso no puede estar vacío.");
        }
        if (prioridad < 1 || prioridad > 10) {
            throw new IllegalArgumentException("La prioridad debe estar en el rango de 1 a 10.");
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Prioridad: %d", id, nombre, prioridad);
    }
}