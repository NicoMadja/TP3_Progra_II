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

    public abstract int pertenece(int elemento);
    // post: devuelve true si y solo si x es uno de los elementos de a.

    public abstract void eliminar(int elemento);
    // pre: x pertenece a a.
    // post: a queda con los mismos elementos que tenia, salvo x, que fue eliminado; se preserva la propiedad de ABB
    // para el resto.

    public abstract boolean esVacio();
    // post: devuelve true si y solo si a no tiene elementos.

    public abstract int cantidadNodos();
    // post: devuelve la cantidad de elementos que tiene a.

    /*
    Nota sobre insertar/pertenece: ambas bajan un nivel del arbol por
    llamada recursiva, comparando x contra el nodo actual. El costo de
    cada una es O(altura del arbol): O(log n) si el arbol esta
    balanceado, O(n) en el peor caso (arbol degenerado, equivalente a
    una lista enlazada). Ver Clase8.pptx (Bloque de complejidad).

    Recorridos (no forman parte de la especificacion del TDA -- son
            formas de RECORRER un arbol ya construido, aplicables a cualquier
                        arbol binario, no solo a un ABB):

    inorder(a: Arbol)     -- visita: izquierdo, nodo, derecho
    En un ABB, imprime los elementos en orden CRECIENTE.

    preorder(a: Arbol)    -- visita: nodo, izquierdo, derecho

    postorder(a: Arbol)   -- visita: izquierdo, derecho, nodo

    recorridoPorNiveles(a: Arbol) -- visita nivel por nivel (BFS),
    de izquierda a derecha, usando una Cola auxiliar (TDA Cola).

    Nota: esta es la misma especificacion usada en el TP3 (TDA Arbol Binario de Busqueda). Los nombres de clases y
    metodos de la implementacion (NodoArbol, ArbolBinarioBusqueda, insertar, pertenece, inorder, preorder, postorder,
    recorridoPorNiveles) son identicos entre esta clase y el TP -- ver ArbolBinarioBusqueda.java.

    Convencion de altura(): arbol vacio -> altura 0; arbol de un solo nodo -> altura 1. Cada nivel adicional suma 1.
 */
}
