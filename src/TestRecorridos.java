import Implementaciones.ArbolBinarioBusqueda;

public class TestRecorridos {
    public static void main(String[] args) {

        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        // insertamos todos los elementos no ordenados.
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);
        arbol.insertar(10);
        arbol.insertar(25);
        arbol.insertar(65);
        arbol.insertar(90);

        arbol.inorder();
    }
}