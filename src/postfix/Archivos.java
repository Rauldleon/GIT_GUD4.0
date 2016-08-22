package postfix;
/*
* Archivos.java
* Clase que maneja el archivo en donde estará la linea de datos en formato postfix.
*/

import java.io.*;
       
/**
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
public class Archivos{

    /**
     *Metodo que lee y devuelve las lineas que tienen datos en el archivo.
     * @param direccion
     * @return texto leido de un archivo externo
     */
    public String leerArchivos(String direccion){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                //Hace el ciclo mientra bfRead tiene datos
                temp = temp + bfRead;//guardado e; texto del archivo
            }
            texto = temp;
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        return texto;
    }
}
    