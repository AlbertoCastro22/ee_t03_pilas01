/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test6;

/**
 *
 * @author Usersone
 */
public class Lista<T extends Comparable<T>> {
    private Nodo<T> inicio;
    
    public void setInicio(Nodo<T> inicio){
        this.inicio=inicio;
    }
    public Nodo<T> getInicio(){
    return inicio;
    }
    public void AgregarInicio(T dato){
        Nodo<T> nuevo=new Nodo<T>(dato);
        nuevo.setSiguiente(inicio);
        inicio=nuevo;
    }
    public String toString(){
   
   Nodo<T> temporal=inicio;
    String s="";
     while(temporal!=null){
       s+=temporal.getDato()+"-->";
       temporal=temporal.getSiguiente();
   }
    return s+""+null;
    }
      public void InsertarFinal(T dato){
        //solo servira aqui...
        Nodo<T> temporal;
        temporal=inicio;
        //si la lista esta vacia se generara un NullPointerException
        if(inicio==null){
            this.AgregarInicio(dato);
            
        }
        else{
            while(temporal.getSiguiente()!=null){
                temporal=temporal.getSiguiente();
            }
            temporal.setSiguiente(new Nodo(dato));
        }
    }
      
   
        public T eliminaFInalDevolviendo(){
         Nodo <T> temporal,anterior =null;
        temporal=inicio;
        if(inicio.getSiguiente()==null){
            inicio=null;
        }
        else{
            while(temporal.getSiguiente()!=null){
                anterior=temporal;
                temporal=temporal.getSiguiente();
               
            }
           
           anterior.setSiguiente(null);
        }
        return temporal.getDato();
        }
        
         public T EliminaPrimeroDevolviendo(){
        Nodo <T>temporal=inicio;
        if(temporal.getSiguiente()!=null){
            inicio=temporal.getSiguiente();
        }
        else{
            inicio=null;
        }
        return temporal.getDato();
    }
         
}
