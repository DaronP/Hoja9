package hoja9;



/**
 * @author Claude Calewaert, Arsenalist
 * @fuente Tomado y basado del algoritmo creado por Arsenalist en Github:
 * https://github.com/Arsenalist/Red-Black-Tree-Java-Implementation/blob/master/src/RedBlackNode.java  
 * @parametro <T>
 * @proposito Generar los nodos a utilizar en el RBT
 */

class RedBlackNode<T extends Comparable<T>> {

    //Posible color para dicho nodo
    public static final int BLACK = 0;
    
    //Posible color para dicho nodo
    public static final int RED = 1;
    
	//La llave de cada nodo
	public T key;

    //Padre del nodo
    RedBlackNode<T> parent;
    
    //Hijo izquierdo
    RedBlackNode<T> left;
    
    //Hijo derecho
    RedBlackNode<T> right;
    
    // Numero de elementos hacia la izquierda de cada nodo
    public int numLeft = 0;
    
    // Numero de elementos hacia la derecha de cada nodo
    public int numRight = 0;
    
    // Color del nodo
    public int color;

    RedBlackNode(){
        color = BLACK;
        numLeft = 0;
        numRight = 0;
        parent = null;
        left = null;
        right = null;
    }

	// Constructor que establece la llave al argumento
	RedBlackNode(T key){
        this();
        this.key = key;
	}
}
