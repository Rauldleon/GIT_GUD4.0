/**
 * PilaArrayList.java
 * Clase en donde se define la pila del tipo ArrayList.
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
package postfix;
import java.util.*;

/**
 * Clase en donde se define la pila del tipo ArrayList. 
 * @param <T> Tipo de dato genérico.
 */
public class PilaArrayList<T> extends Pila<T>{
	private ArrayList<T> ar;
    /**
     * Metodo constructor de la clase.
     */
    public PilaArrayList(){
		ar = new ArrayList<T>();
	}
	
    /**
     * Metodo que agrega un dato a la pila del tipo arraylist.
     * @param objeto dato a agregar.
     */
    @Override
	public void push(T objeto) {
		// TODO Auto-generated method stub
		ar.add(objeto);
	}

    /**
     * Metodo que obtiene de la pila del tipo arrayList un dato en una posicion dada.
     * @param index posicion a obtener el dato.
     * @return dato en la posicion ingresada.
     */
    @Override
	public T pop(int index) {
		// TODO Auto-generated method stub
		return ar.get(index);
	}

    /**
     * Metodo que elimina un dato en la pila del tipo arraylist dada una posicion.
     * @param index posicion a eliminar el dato de la pila.
     */
    @Override
	public void eliminar(int index) {
		// TODO Auto-generated method stub
		ar.remove(index);
	}

    /**
     * Metodo que obtiene el tamaño de la pila.
     * @return el tamaño de la pila.
     */
    @Override
	public int getSize() {
		// TODO Auto-generated method stub
		return ar.size();
	}
	
}
