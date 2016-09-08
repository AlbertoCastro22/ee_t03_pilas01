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
public class Test6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pila<Integer> miPila=new Pila<Integer>();
       Cola<Integer> miCola=new Cola<Integer>();

     miPila.push(100);
        miPila.push(1);
         miPila.push(3);
          miPila.push(4);
           System.out.println( miPila.pop());
           System.out.println( miPila.peek());
            System.out.println( miPila.pop());
       miCola.insertar(109);
        miCola.insertar(10);
         miCola.insertar(9);
          miCola.insertar(0);
       System.out.println(miCola);
       miCola.retirar();
        System.out.println(miCola);
        
            
            

    }
}
