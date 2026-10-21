// Piña Becerra Victor Osvaldo

package back_end;

public class Nodo {
    private Proceso dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Proceso dato) {
        this.dato = dato;
        this.siguiente = this;
        this.anterior = this;
    }

    public Proceso getDato() {
        return dato;
    }

    public void setDato(Proceso dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}