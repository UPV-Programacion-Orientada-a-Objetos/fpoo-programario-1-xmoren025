package edu.upvictoria.fpoo.Problema5;

import edu.upvictoria.fpoo.Problema3.AreaRect;
import junit.framework.TestCase;
import org.junit.Test;

public class AreaTerrTest extends TestCase {
    @Test
    public void testCalcularATerr_AB_Decimales() {
        double A = 30.2;
        double B = 12.5;
        AreaTerr ca = new AreaTerr();
        assertEquals(283.125,ca.calcularATerr(A,B));
    }
    @Test
    public void testCalcularATerr_AB_Enteros() {
        double A = 25;
        double B = 10;
        AreaTerr ca = new AreaTerr();
        assertEquals(187.5,ca.calcularATerr(A,B));
    }
    @Test
    public void testCalcularATerr_AB_DecYEnt() {
        double A = 45.7;
        double B = 23;
        AreaTerr ca = new AreaTerr();
        assertEquals(788.325,ca.calcularATerr(A,B));
    }
}