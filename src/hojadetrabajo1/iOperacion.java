/**
 * iOperacion.java
 * Clase interfaz para la clase operacion.
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
package postfix;

/**
 *
 * @author Didier
 */
public interface iOperacion {

    /**
     *
     */
    public void operar();

    /**
     *
     * @return
     */
    public int resultado();

    /**
     *
     * @return
     */
    public String toString();
}
