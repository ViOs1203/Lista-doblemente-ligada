// Piña Becerra Victor Osvaldo


package back_end;

public class ListaCircular {
    private Nodo primero;
    private Nodo ultimo;
    private int tamanio;

    public ListaCircular() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public int getTamanio() {
        return tamanio;
    }


    public void insertarAlPrincipio(Proceso dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
            primero.setSiguiente(primero);
            primero.setAnterior(primero);
        } else {
            nuevo.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            primero.setAnterior(nuevo);
            ultimo.setSiguiente(nuevo);
            primero = nuevo;
        }
        tamanio++;
    }

    public void insertarAlFinal(Proceso dato) {
        if (estaVacia()) {
            insertarAlPrincipio(dato);
            return;
        }
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(primero);
        nuevo.setAnterior(ultimo);
        ultimo.setSiguiente(nuevo);
        primero.setAnterior(nuevo);
        ultimo = nuevo;
        tamanio++;
    }

    public void insertarPorPosicion(Proceso dato, int posicion) {
        if (posicion < 0 || posicion > tamanio) {
            throw new IndexOutOfBoundsException("Posición fuera de rango. Rango válido: 0 a " + tamanio);
        }
        if (posicion == 0) {
            insertarAlPrincipio(dato);
        } else if (posicion == tamanio) {
            insertarAlFinal(dato);
        } else {
            Nodo actual = obtenerNodoPorPosicion(posicion);
            Nodo anteriorNodo = actual.getAnterior();
            Nodo nuevo = new Nodo(dato);

            nuevo.setSiguiente(actual);
            nuevo.setAnterior(anteriorNodo);
            anteriorNodo.setSiguiente(nuevo);
            actual.setAnterior(nuevo);

            tamanio++;
        }
    }


    public Proceso removerAlPrincipio() {
        validarNoVacia();
        Proceso eliminado = primero.getDato();

        if (tamanio == 1) {
            vaciar();
        } else {
            primero = primero.getSiguiente();
            primero.setAnterior(ultimo);
            ultimo.setSiguiente(primero);
            tamanio--;
        }
        return eliminado;
    }

    public Proceso removerAlFinal() {
        validarNoVacia();
        if (tamanio == 1) {
            return removerAlPrincipio();
        }
        Proceso eliminado = ultimo.getDato();
        ultimo = ultimo.getAnterior();
        ultimo.setSiguiente(primero);
        primero.setAnterior(ultimo);
        tamanio--;
        return eliminado;
    }

    public Proceso removerPorPosicion(int posicion) {
        validarNoVacia();
        if (posicion < 0 || posicion >= tamanio) {
            throw new IndexOutOfBoundsException("Posición fuera de rango. Rango válido: 0 a " + (tamanio - 1));
        }
        if (posicion == 0) {
            return removerAlPrincipio();
        }
        if (posicion == tamanio - 1) {
            return removerAlFinal();
        }

        Nodo aEliminar = obtenerNodoPorPosicion(posicion);
        Nodo ant = aEliminar.getAnterior();
        Nodo sig = aEliminar.getSiguiente();

        ant.setSiguiente(sig);
        sig.setAnterior(ant);

        tamanio--;
        return aEliminar.getDato();
    }


    public Proceso mostrarAlPrincipio() {
        validarNoVacia();
        return primero.getDato();
    }

    public Proceso mostrarAlFinal() {
        validarNoVacia();
        return ultimo.getDato();
    }

    public Proceso mostrarPorPosicion(int posicion) {
        validarNoVacia();
        if (posicion < 0 || posicion >= tamanio) {
            throw new IndexOutOfBoundsException("Posición fuera de rango. Rango válido: 0 a " + (tamanio - 1));
        }
        return obtenerNodoPorPosicion(posicion).getDato();
    }

    public ResultadoBusqueda buscarPorId(int id) {
        validarNoVacia();
        Nodo actual = primero;
        int pos = 0;

        do {
            if (actual.getDato().id() == id) {
                return new ResultadoBusqueda(actual.getDato(), pos);
            }
            actual = actual.getSiguiente();
            pos++;
        } while (actual != primero);

        return null;
    }

    public Nodo obtenerNodoPorPosicion(int posicion) {
        Nodo actual = primero;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    public void vaciar() {
        primero = null;
        ultimo = null;
        tamanio = 0;
    }

    private void validarNoVacia() {
        if (estaVacia()) {
            throw new IllegalStateException("La lista circular está vacía.");
        }
    }

    public Nodo getPrimero() {
        return primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public record ResultadoBusqueda(Proceso proceso, int posicion) {}
}
