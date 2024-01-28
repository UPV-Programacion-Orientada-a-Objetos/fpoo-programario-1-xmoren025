package edu.upvictoria.fpoo.Problema3;

import edu.upvictoria.fpoo.Problema3.AreaRect;
import junit.framework.TestCase;
import org.junit.Test;

public class AreaRectTest extends TestCase {
    @Test
    public void testCalcularARect_datos_enteros() {
        float b=15;
        float h=7;
        AreaRect ca = new AreaRect();
        assertEquals(105F,ca.calcularARect(b,h));
    }
    @Test
    public void testCalcularARect_datos_decimales() {
        float b=15.7F;
        float h=6.3F;
        AreaRect ca = new AreaRect();
        assertEquals(98.91F,ca.calcularARect(b,h));
    }
}