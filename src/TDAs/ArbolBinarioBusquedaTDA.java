package TDAs;

public abstract class ArbolBinarioBusquedaTDA {
    // Dominio:
    // ArbolBinarioBusqueda = Conjunto ordenado de elementos comparables entre si (sin repetidos), organizados en nodos
    // de a lo sumo dos hijos, tales que para todo nodo del arbol, los elementos del subarbol izquierdo son menores que
    // el elemento del nodo, y los elementos del subarbol derecho son mayores.

    // Operaciones:
    // crear(); -> Arbol
    // post: devuelve un arbol vacio.

    public abstract void insertar(int elemento);
    // post: a queda con los mismos elementos que tenia mas x (si x ya pertenecia a a, el arbol no se modifica).

    public abstract boolean pertenece(int elemento);
    // post: devuelve true si y solo si x es uno de los elementos de a.

    // eliminar(int elemento);
    // pre: x pertenece a a.
    // post: a queda con los mismos elementos, salvo x, que fue eliminado; se preserva la propiedad ABB para el resto.

    public abstract boolean esVacio();
    // post: devuelve true si y solo si a no tiene elementos.

    public abstract int cantidadNodos();
    // post: devuelve la cantidad de elementos que tiene a.
}
