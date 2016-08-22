package postfix;
/*
 * Operacion.java
 * Clase que sirve de calculadora para operar la linea que contiene las operaciones postfix.
 */
import java.util.*;
/**
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
public class Operacion implements iOperacion{
    String linea;
    Pila pila;
    int result;
    
    /**
     * Metodo constructor de la clase.
     * @param linea cadena que contiene los numeros y operaciones aritmeticas.
     * @param pil pila donde se almacenaran los datos.
     */
    public Operacion(String linea, Pila pil){
        this.linea=linea;
        pila=pil;
    }
    //Usado en el JUnit Test
    Operacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Setea la cadena que contiene los numeros y operaciones aritmeticas.
     * @param linea cadena que contiene los numeros y operaciones aritmeticas.
     */
    public void setLinea(String linea){
        this.linea=linea;
    }

    /**
     * Regresa la cadena que contiene los numeros y operaciones aritmeticas.
     * @return la cadena que contiene los numeros y operaciones aritmeticas.
     */
    public String getLinea(){
        return linea;
    }

    /**
     * Setea la pila donde se almacenaran los datos.
     * @param pila pila donde se almacenaran los datos.
     */
    public void setPila(Pila pila){
        this.pila=pila;
    }

    /**
     * Regresa la pila donde se almacenaran los datos.
     * @return pila donde se almacenaran los datos.
     */
    public Pila getPila(){
        return pila;
    }

    /**
     * Setea el resultado final de operar en postfix la linea de datos y operaciones aritmeticas ingresada en el archivo.
     * @param result resultado final.
     */
    public void setResult(int result){
        this.result=result;
    }

    /**
     * Regresa el resultado final de operar en postfix la linea de datos y operaciones aritmeticas ingresada en el archivo.
     * @return resultado final.
     */
    public int getResult(){
        return result;
    }

    /**
     * Metodo que sirve de calculadora para llegar al resultado final de la linea ingresada en formato postfix de operacion.
     */
    @Override
    public void operar() {
        //Variables necesarias en el metodo, contador, resultado (operacion), y la cadena de numeros.
        int cont=0;
        int operacion=0;
        String cadenaNum="";
        
        //Se realiza un ciclo a lo largo de la cadena de texto en formato postfix.
        while(cont<linea.length()){
            
            //Si se encuentra un simbolo de operacion aritmetica se operan los dos numeros que se encuentran en la pila en ese momento.
            //Este se aplica para la multiplicacion, división, suma y resta.
            if((linea.charAt(cont))=='+'){
              
               operacion=((Integer)pila.pop((pila.getSize()-2)))+((Integer)pila.pop((pila.getSize()-1)));
               pila.eliminar(((pila.getSize()-2)));
               pila.eliminar(((pila.getSize()-1)));
               pila.push(operacion);
 
               
            }
            else if(linea.charAt(cont)=='-'){
               operacion=((Integer)pila.pop((pila.getSize()-2)))-((Integer)pila.pop((pila.getSize()-1)));
               pila.eliminar(((pila.getSize()-2)));
               pila.eliminar(((pila.getSize()-1)));
               pila.push(operacion);
               
                    }
            else if(linea.charAt(cont)=='*'){
               operacion=((Integer)pila.pop((pila.getSize()-2)))*((Integer)pila.pop((pila.getSize()-1)));
               pila.eliminar(((pila.getSize()-2)));
               pila.eliminar(((pila.getSize()-1)));
               pila.push(operacion);
               
        }
            else if(linea.charAt(cont)=='/'){
               operacion=((Integer)pila.pop((pila.getSize()-2)))/((Integer)pila.pop((pila.getSize()-1)));;
               pila.eliminar(((pila.getSize()-2)));
               pila.eliminar(((pila.getSize()-1)));
               pila.push(operacion);
            }
            //Si hay un espacio en blanco no hace nada.
            else if(linea.charAt(cont)==' '){
    
            }
            //Si se encuentra con un numero, se va apilando en el stack (lista, arraylist o vector)
            else{
               if(linea.charAt(cont+1)!=' '){
                    cadenaNum+=Character.toString(linea.charAt(cont));
               }
               else if(linea.charAt(cont+1)==' '){
       
                    cadenaNum+=Character.toString(linea.charAt(cont));
                    int b=(pila.getSize()-1); 
                    pila.push(Integer.parseInt(cadenaNum)); 
                    cadenaNum="";
               }
            }
            //Aumenta uno al contador de los caracteres de la linea.
            cont+=1;
        }
        //El resultado final será el primer elemento del stack, que sera el resultado de todas las operaciones realizadas.
        result=(Integer)pila.pop(0);
    }

    /**
     * Devuelve el resultado final.
     * @return Resultado final.
     */
    @Override
    public int resultado() {
        return result;
    }
    /**
     * Devuelve un string con los atributos de la clase.
     * @return La cadena con los atributos de la clase.
     */
    @Override
     public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Linea de datos:");
        sb.append(linea);
        sb.append("Pila de valores:");
        sb.append(pila);
        sb.append("Resultado:");
        sb.append(result);
        return sb.toString();
    }
    
}