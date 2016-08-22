/**
 * PilaFactory.java
 * Clase Factory que devuelve una instancia del tipo Pila, dada la opcion que eligio el usuario.
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
package postfix;
class PilaFactory {
	/**
         * Metodo que obtiene la instancia dependiendo de la eleccion del usuario en tiempo de ejecucion.
        @param opcion Decision en tiempo de ejecucion del usuario.
         */
	public Pila opcionesPila(String opcion){
		//Si eligio un arraylist, devuelve dicha instancia.
		if(opcion.equals("ArrayList")){
			return new PilaArrayList();
		}
                //Si eligio un list, devuelve dicha instancia.
		else if(opcion.equals("pilaList")){
			return new pilaList();
		}
                //Si eligio un vector, devuelve dicha instancia.
		else{
			return new PilaVector();
		}
	}
}
