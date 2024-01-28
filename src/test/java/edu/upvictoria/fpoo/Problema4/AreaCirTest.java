package edu.upvictoria.fpoo.Problema4;

import edu.upvictoria.fpoo.Problema3.AreaRect;
import junit.framework.TestCase;
import org.junit.Test;

public class AreaCirTest extends TestCase {
    @Test
    public void testCalcularACir_RDecimal() {
        double r = 6.5;
        AreaCir ca = new AreaCir();
        assertEquals(133D,ca.calcularACir(r));
    }
    @Test
    public void testCalcularACir_REntero() {
        double r = 35;
        AreaCir ca = new AreaCir();
        assertEquals(3848D,ca.calcularACir(r));
    }
}