package postfix;
/*
 * main.java
 * Clase principal donde se dirige el procedimiento postfix de operacion de numeros.
 */

/**
 *
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
import java.util.Scanner;


public class main {

    /**
     * Clase principal donde se dirige el procedimiento postfix de operacion de numeros.
     * @param args
     */
    public static void main(String[] args){
        //Se declaran variables para el trabajo postfix.
        Archivos a = new Archivos();
        String linea=" ";
        linea=(a.leerArchivos("C:\\Users\\Didier\\Desktop\\PostFix\\src\\postfix\\datos.txt"));
        int cont=0;
        Scanner scan=new Scanner(System.in);
        Pila pil;
        PilaFactory fact=new PilaFactory();
        int op=0;
        
        //Se da la bienvenida al usuario.
        System.out.println("Bienvenido, elija el metodo a utilizar:");
        //Se realiza un ciclo para mantener funcionando el programa cuando se opera con un procedimiento elegido.
        while (cont==0){
        	System.out.println("1. Operar por ArrayList");
        	System.out.println("2. Operar por List");
        	System.out.println("3. Operar por Vector");
        	System.out.println("4. Salir");
                //Obtiene la opcion elegida e ingresada por el usuario.
        	op=scan.nextInt();
        	if(op==1){
                    //Se operan los datos por medio de un ArrayList.
        		pil=fact.opcionesPila("ArrayList");
        		Operacion opera = new Operacion(linea,pil);
                opera.operar();
                System.out.println("\n"+"El resultado de las operaciones expresadas en el archivo es:"+opera.resultado() + "\n"+ "\n");  	
        	}
        	else if(op==2){
                    //Se operan los datos mediante una Lista.
        		pil=fact.opcionesPila("pilaList");
        		Operacion opera = new Operacion(linea,pil);
                opera.operar();
                System.out.println("\n"+"El resultado de las operaciones expresadas en el archivo es:"+opera.resultado()+ "\n"+ "\n");
			        	}
        	else if(op==3){
                    //Se operan los datos mediante un vector.
        		pil=fact.opcionesPila("Another");
        		Operacion opera = new Operacion(linea,pil);
                opera.operar();
                System.out.println("\n"+"El resultado de las operaciones expresadas en el archivo es:"+opera.resultado()+ "\n"+ "\n");
			}
        	else if(op==4){
                    //Se despide el programa del usuario.
        		System.out.println("\n"+"Gracias por utilizar nuestra aplicacion :D"+ "\n");
				cont=1;
			}
        	else{
                    //Si ingresa una opcion que no esta entre las mostradas, muestra un error.
        		System.out.println("\n"+"ERROR, reingrese la opcion elegida..."+ "\n");
        	}
        
        }
    }
    
}
