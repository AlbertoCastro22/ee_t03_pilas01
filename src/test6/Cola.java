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
public class Cola<T extends Comparable<T>> {
    
    private Lista<T> cola=new Lista<T>();
    public void insertar(T dato){
        cola.InsertarFinal(dato);
        
    }
    public T retirar(){
    return cola.EliminaPrimeroDevolviendo();
    }
    public String toString(){
        String s="";
        s+=cola;
        return s;
    }
    
}
