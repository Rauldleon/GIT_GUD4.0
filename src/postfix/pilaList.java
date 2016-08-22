/**
 * pilaList.java
 * Clase que se encarga de manejar las pilas del tipo lista.
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
package postfix;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que se encarga de manejar las pilas del tipo lista.
 * @param <T> Dato generico.
 */
public class pilaList<T> extends Pila<T>{
	
	private List<T> lista; 
	
    /**
     *Metodo constructor.
     */
    public pilaList(){
		lista = new ArrayList<T>();
		
	}

    /**
     * Metodo que agrega un dato a la pila del tipo lista.
     * @param objeto dato a agregar.
     */
    @Override
	public void push(T objeto) {
		// TODO Auto-generated method stub
		lista.add(objeto);
	}

    /**
     * Metodo que obtiene de la pila del tipo lista un dato en una posicion dada.
     * @param index posicion a obtener el dato.
     * @return dato en la posicion ingresada.
     */
    @Override
	public T pop(int index) {
		// TODO Auto-generated method stub
		return lista.get(index);
	}

    /**
     * Metodo que elimina un dato en la pila del tipo lista dada una posicion.
     * @param index posicion a eliminar el dato de la pila.
     */
    @Override
	public void eliminar(int index) {
		// TODO Auto-generated method stub
		lista.remove(index);
	}

    /**
     * Metodo que obtiene el tamaño de la pila del tipo lista.
     * @return el tamaño de la pila.
     */
    @Override
	public int getSize() {
		// TODO Auto-generated method stub
		return lista.size();
	}
	
}
