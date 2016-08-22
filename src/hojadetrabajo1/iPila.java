/**
 * iPila.java
 * Clase de interfaz que utilizara la clase abstracta del tipo Pila.
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
package postfix;

/**
 * Clase de interfaz que utilizara la clase abstracta del tipo Pila.
 * @param <T> Dato generico.
 */
public interface iPila <T> {

    /**
     * Metodo que agrega un dato a la pila.
     * @param objeto dato a agregar.
     */
    public void push(T objeto);

    /**
     * Metodo que obtiene de la pila un dato en una posicion dada.
     * @param index posicion a obtener el dato.
     * @return dato en la posicion ingresada.
     */
    public T pop(int index);

    /**
     * Metodo que elimina un dato en la pila dada una posicion.
     * @param index posicion a eliminar el dato de la pila.
     */
    public void eliminar(int index);

    /**
     * Metodo que obtiene el tamaño de la pila.
     * @return el tamaño de la pila.
     */
    public int getSize();
}
