package edu.upvictoria.fpoo.Problema8;

import edu.upvictoria.fpoo.Problema7.PagoLeche;
import junit.framework.TestCase;
import org.junit.Test;

public class DistanciaTest extends TestCase {
    @Test
    public void testCalcularDistancia() {
        int x1 = 32;
        int y1 = 120;
        int x2 = 32;
        int y2 = 120;
        PagoLeche cp = new PagoLeche();
        assertEquals(1030D,cp.calcularPagoL(L,precio));
    }
}