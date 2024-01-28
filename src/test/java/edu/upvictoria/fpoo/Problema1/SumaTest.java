package edu.upvictoria.fpoo.Problema1;

import junit.framework.TestCase;
import org.junit.Test;


public class SumaTest extends TestCase {
    @Test
    public void testSumar_dos_numeros_negativos() {
        int a= -10;
        int b=-15;
        Suma s = new Suma();
        assertEquals(-25,s.sumar(a,b));
    }

    @Test
    public void testSumar_dos_numeros_positivos(){
        int a= 10;
        int b= 15;
        Suma s = new Suma();
        assertEquals(25,s.sumar(a,b));
    }
    @Test
    public void testSumar_dos_numeros_positivo_negativo(){
        int a= 10;
        int b= -15;
        Suma s = new Suma();
        assertEquals(-5,s.sumar(a,b));
    }
}