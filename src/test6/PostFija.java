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
public class PostFija< T extends Comparable <T>> {
    Pila<T> pila=new Pila<T>();
    Pila<String> s=new Pila<String>();
    String simbolo,resultado = "";
    boolean band=false;
    public String ConversionPostFija(String ei){
    
    while(ei.length()!=0){
        simbolo=ei.substring(1, 1);
        ei.substring(1, ei.length()-1);
        if(simbolo.equals("(")){
        pila.push((T) simbolo);
        }//fin del if de la linea 19
        
        else{
        if(simbolo.equals(")")){
        while(!pila.peek().equals("(")){
            resultado= resultado+pila.pop();
           }//fin del while de la linea 24
        
        }//fin del if de la linea 23
        
        else{
               if(this.ischecaOperando()){
                   resultado=resultado+simbolo;
               }//fin del if de la linea 30
               else{
               while(this.ischecaOperandor()){
                   resultado=resultado+pila.pop();
               }//fin del while de la linea 34
               
               pila.push((T) simbolo);
               
               }//fin del else de la linea 33
               
                }//fin del else de la linea 29
        
        }//fin del else de la linea 22
        
    }//fin del while de la linea 16
    
    while(!pila.isVacia()){
    resultado=resultado+pila.pop();
    
    }//fin del while de la linea 42
    
   return resultado;
   
    }//fin del metodo conversion
   
    public boolean ischecaOperandor(){
        if(simbolo.equals("(")){
            band=true;
        }//cierra  linea 61
        else{
            if(simbolo.equals(")")){
                band=true;
            }//cierra if linea 65
            else{
                if(simbolo.equals("*")||simbolo.equals("/")){
                band=true;
                }//cierra if linea 69
                
                 else{
                    if(simbolo.equals("+")||simbolo.equals("-")){
                band=true;
                } 
                    
                }//cirra else linea 80
            }//cierra else linea 76
       
   
        }//cierra else linea 64
        return band;
    }//fin del metodo checar operando
    public void prioridad(){
        switch(simbolo){
             case "^    ":
                pila.push((T) "^");
                break;
            case "(":
               pila.push((T) "(");
                break;
                case ")":
                pila.push((T) ")");
                break;
                    case "/":
                pila.push((T) "/");
                break;
                        case "*":
                pila.push((T) "*");
                break;
                            case "+":
                pila.push((T) "+");
                break;
                                case "-":
                pila.push((T) "-");
                break;
                
                
        }
    }
    public Boolean ischecaOperando(){
        switch(pila.peek().toString()){}
    return band;
    }
    }//fin de la clase PostFija
    

