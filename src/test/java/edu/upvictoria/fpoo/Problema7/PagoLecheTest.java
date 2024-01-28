package edu.upvictoria.fpoo.Problema7;

import junit.framework.TestCase;
import org.junit.Test;

public class PagoLecheTest extends TestCase {
    @Test
    public void testCalcularPagoL_precioL_Enteros() {
        double L = 24;
        double precio = 220;
        PagoLeche cp = new PagoLeche();
        assertEquals(1395D,cp.calcularPagoL(L,precio));
    }
    @Test
    public void testCalcularPagoL_precioL_Decimales() {
        double L = 5.8;
        double precio = 90.5;
        PagoLeche cp = new PagoLeche();
        assertEquals(139D,cp.calcularPagoL(L,precio));
    }
    @Test
    public void testCalcularPagoL_precioDec_LEnt() {
        double L =15;
        double precio = 75.6;
        PagoLeche cp = new PagoLeche();
        assertEquals(300D,cp.calcularPagoL(L,precio));
    }
    @Test
    public void testCalcularPagoL_precioEnt_LDec() {
        double L = 32.5;
        double precio = 120;
        PagoLeche cp = new PagoLeche();
        assertEquals(1030D,cp.calcularPagoL(L,precio));
    }
}