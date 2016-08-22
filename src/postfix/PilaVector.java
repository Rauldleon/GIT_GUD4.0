/**
 * PilaVector.java
 * Clase en donde se define la pila del tipo Vector.
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
package postfix;
import java.util.*;

/**
 * Clase en donde se define la pila del tipo Vector.
 * @param <T> Tipo de dato genérico.
 */
public class PilaVector<T> extends Pila<T>{
	private Vector vect;

    /**
     *Metodo constructor de la clase.
     */
    public PilaVector(){
		vect = new Vector();
	}

    /**
     * Metodo que agrega un dato a la pila del tipo vector.
     * @param objeto dato a agregar.
     */
    @Override
	public void push(T objeto) {
		// TODO Auto-generated method stub
		vect.add(objeto);
	}

    /**
     * Metodo que obtiene de la pila del tipo vector un dato en una posicion dada.
     * @param index posicion a obtener el dato.
     * @return dato en la posicion ingresada.
     */
    @Override
	public T pop(int index) {
		// TODO Auto-generated method stub
		return (T) vect.get(index);
	}

    /**
     * Metodo que elimina un dato en la pila del tipo vector dada una posicion.
     * @param index posicion a eliminar el dato de la pila.
     */
    @Override
	public void eliminar(int index) {
		// TODO Auto-generated method stub
		vect.remove(index);
	}

    /**
     * Metodo que obtiene el tamaño de la pila.
     * @return el tamaño de la pila.
     */
    @Override
	public int getSize() {
		// TODO Auto-generated method stub
		return vect.size();
	}
	
	
}
