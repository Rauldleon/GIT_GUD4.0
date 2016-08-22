import java.util.*;

public class PilaVector<T> extends Pila<T>{
	Vector vect;

	public PilaVector(){
		vect = new Vector();
	}

	
	@Override
	public void push(T objeto) {
		// TODO Auto-generated method stub
		vect.add(objeto);
	}


	public T pop(int index) {
		// TODO Auto-generated method stub
		return (T) vect.get(index);
	}

	@Override
	public void eliminar(int index) {
		// TODO Auto-generated method stub
		vect.remove(index);
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return vect.size();
	}
	
	
}
