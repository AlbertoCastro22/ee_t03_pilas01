package test6;

/**
 *Esta clase implementa una Pila con una lista Ligada, la pila esta vacia cuando la lista
 * vacia. Insertamos lementos al final de la lista y retiramos elementos al final de la misma
 * 
 */
public class Pila <T extends Comparable <T>>{
    private Lista<T> pila=new Lista<T>();
            private boolean vacia;
            public void isVacia(boolean vacia){
            this.vacia=vacia;
            }
            
           public boolean isVacia(){
        return pila.getInicio().getDato() == null;
    }
   
    public T push(T dato){
       
        pila.InsertarFinal(dato);
       
       
        return dato;
       
    }
    
    public T pop(){
       
     pila.eliminaFInalDevolviendo();
        
       
        
        
        return pila.getInicio().getDato();
    }
    
    public T  peek(){
        Nodo<T> temporal=pila.getInicio();
        while(temporal.getSiguiente()!=null){
           temporal=temporal.getSiguiente();
        }
        return temporal.getDato();
    }
    
    
    
}
//construir expresiones algebraicas
/*
((3+4)/2*3)
1.- si el simbolo analizado es parentesis izquierdo (?)
entonces agregar un nuevo nodo
el hijo iquierdo del nodo actual
y vamos a bajar al ndo izquierdo
2.-si es un operador (?)
entonces poner el mismo como valor del nodo actual y agregar un nodo
a la derecha del nodo actual y bajar al nodo derecho.
3.-Si el simbolo es operando ?
poner el mismo como valor del nodo y regresar al papa
4.- si el nodo es parentesis derecho ?
ir al papa del nodo actual.

*/