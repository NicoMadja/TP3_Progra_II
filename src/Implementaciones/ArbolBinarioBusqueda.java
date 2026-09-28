package Implementaciones;

public class ArbolBinarioBusqueda {
    private NodoArbol raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    // insertar(a, x) -> Arbol
    // post: a queda con los mismos elementos que tenia mas x
    //       (si x ya pertenecia a a, el arbol no se modifica)
    // COSTO: O(altura del arbol) -- en cada llamada se baja un nivel.
    public void insertar(int x) {
        raiz = insertarAux(raiz, x);
    }
    private NodoArbol insertarAux(NodoArbol nodo, int x) {
        if (nodo == null) {
            return new NodoArbol(x);
        }
        if (x < nodo.dato) {
            nodo.izquierdo = insertarAux(nodo.izquierdo, x);
        } else if (x > nodo.dato) {
            nodo.derecho = insertarAux(nodo.derecho, x);
        }
        // si x == nodo.dato: no se admiten repetidos, el arbol no cambia
        return nodo;
    }

    // pertenece(a, x) -> boolean
    // post: devuelve true si y solo si x es uno de los elementos de a
    // COSTO: O(altura del arbol) -- descarta un subarbol entero en cada paso.
    public boolean pertenece(int x) {
        return perteneceAux(raiz, x);
    }
    private boolean perteneceAux(NodoArbol nodo, int x) {
        if (nodo == null) {
            return false;
        }
        if (x == nodo.dato) {
            return true;
        }
        if (x < nodo.dato) {
            return perteneceAux(nodo.izquierdo, x);
        }
        return perteneceAux(nodo.derecho, x);
    }

    // esVacio(a) -> boolean
    // post: devuelve true si y solo si a no tiene elementos
    public boolean esVacio() {
        return raiz == null;
    }
    // cantidadNodos(a) -> entero
    // post: devuelve la cantidad de elementos de a

    public int cantidadNodos() {
        return cantidadNodosAux(raiz);
    }
    private int cantidadNodosAux(NodoArbol nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + cantidadNodosAux(nodo.izquierdo) + cantidadNodosAux(nodo.derecho);
    }

    // inorder: izquierdo, nodo, derecho -> en un ABB da los elementos
    // en orden creciente.
    public void inorder() {
        inorderAux(raiz);
        System.out.println();
    }
    private void inorderAux(NodoArbol nodo) {
        if (nodo != null) {
            inorderAux(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            inorderAux(nodo.derecho);
        }
    }

    // preorder: nodo, izquierdo, derecho
    public void preorder() {
        preorderAux(raiz);
        System.out.println();
    }
    private void preorderAux(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preorderAux(nodo.izquierdo);
            preorderAux(nodo.derecho);
        }
    }

    // postorder: izquierdo, derecho, nodo
    public void postorder() {
        postorderAux(raiz);
        System.out.println();
    }
    private void postorderAux(NodoArbol nodo) {
        if (nodo != null) {
            postorderAux(nodo.izquierdo);
            postorderAux(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }

    // recorridoPorNiveles (BFS): NO es recursivo. Se recorre el arbol
    // nivel por nivel, de izquierda a derecha, usando una Cola auxiliar
    // (TDA Cola, implementacion dinamica vista en el TP2): se encola la
    // raiz y, mientras la cola no este vacia, se desencola un nodo, se lo
    // procesa y se encolan sus hijos (si existen).
    public void recorridoPorNiveles() {
        ColaAuxiliar cola = new ColaAuxiliar();
        if (raiz != null) {
            cola.encolar(raiz);
        }
        while (!cola.esVacia()) {
            NodoArbol actual = cola.desencolar();
            System.out.print(actual.dato + " ");
            if (actual.izquierdo != null) {
                cola.encolar(actual.izquierdo);
            }
            if (actual.derecho != null) {
                cola.encolar(actual.derecho);
            }
        }
        System.out.println();
    }

    // getRaiz(): expone la raiz para que funciones de utilizacion
    // externas (Clase 9: altura, contarHojas, sumaNodos, nivelDe, esABB)
    // puedan recorrer el arbol sin duplicar estado ni romper encapsulamiento
    // de insertar/pertenece.
    public NodoArbol getRaiz() {
        return raiz;
    }
}
