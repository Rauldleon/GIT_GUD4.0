/**
 * Pila.java
 * Clase abstracta donde se declaran los metodos de las clases del tipo Pila.
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
package postfix;
abstract class Pila <T> implements iPila<T>{
	public abstract void push(T objeto);
	public abstract T pop (int index);
	public abstract void eliminar(int index);
	public abstract int getSize();
}
