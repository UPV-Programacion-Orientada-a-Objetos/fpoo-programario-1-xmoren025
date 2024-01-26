package edu.upvictoria.fpoo;

import junit.framework.TestCase;
import org.junit.Test;

public class AreaRectTest extends TestCase {
    @Test
    public void testCalcularARect_datos_enteros() {
        float b=15;
        float h=7;
        AreaRect ca = new AreaRect();
        assertEquals(105,ca.calcularARect(b,h));
    }
    @Test
    public void testCalcularARect_datos_decimales() {
        float b=15.7F;
        float h=6.3F;
        AreaRect ca = new AreaRect();
        assertEquals(98.91,ca.calcularARect(b,h));
    }
}