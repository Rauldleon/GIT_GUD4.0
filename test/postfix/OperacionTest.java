/**
 * OperacionTest.java
 * Clase de testeo de la clase operacion, del metodo operar.
 * @author Didier Salazar, 15487
 * @author Raul de Leon, 15112
 */
package postfix;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OperacionTest {
    
    public OperacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    /**
     * Test of operar method, of class Operacion.
     */
    @Test
    public void testOperar() {
        //Se testea con la linea que se muestra en el documento de la hoja de trabajo, la cual debe dar 15 como resultado final.
        String cadena="1 2 + 4 * 3 +";
        //Se testeo con la instancia en vector.
        Pila pil =new PilaVector();
        Operacion instance = new Operacion(cadena,pil);
        instance.operar();
        int num = 15;
        assertEquals(15, instance.getResult());
        
        // TODO review the generated test code and remove the default call to fail.
    }

    
    
}
